export VAULT_ADDR="https://sample-cluster-public-vault-77d8ddad.c18222e5.z1.hashicorp.cloud:8200";

export VAULT_NAMESPACE="admin"


export VAULT_TOKEN=$(curl -s --header "X-Vault-Namespace: $VAULT_NAMESPACE" \
--request POST --data '{"role_id": "0de5cc12-bb81-6f38-8648-de1ef4758e06", "secret_id": "35cca217-151e-00ce-dc42-794828c0c972"}' \
$VAULT_ADDR/v1/auth/approle/login | jq -r '.auth.client_token' )

curl -s --header "X-Vault-Token: $VAULT_TOKEN" --header "X-Vault-Namespace: $VAULT_NAMESPACE" $VAULT_ADDR/v1/secret/data/sample-secret | jq -r ".data"

curl -s --header "X-Vault-Token: $VAULT_TOKEN" --header "X-Vault-Namespace: $VAULT_NAMESPACE" $VAULT_ADDR/v1/secret/data/gs-vault-config | jq -r ".data"