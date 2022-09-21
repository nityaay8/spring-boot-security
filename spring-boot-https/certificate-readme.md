
## create a JKS keystore:
keytool -genkeypair -alias springboot -keyalg RSA -keysize 4096 -storetype JKS -keystore springboot.jks -validity 3650 -storepass password

## To create a PKCS12 keystore, and we should, the command is the following:
keytool -genkeypair -alias springboot -keyalg RSA -keysize 4096 -storetype PKCS12 -keystore springboot.p12 -validity 3650 -storepass password

keytool -list -v -keystore springboot.jks


keytool -list -v -keystore springboot.p12


### share to  the client
keytool -export -keystore springboot.p12 -alias springboot -file myCertificate.crt



#### more details
https://www.thomasvitale.com/https-spring-boot-ssl-certificate/