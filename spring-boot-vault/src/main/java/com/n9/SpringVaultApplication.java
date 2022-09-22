package com.n9;

import com.n9.config.UserConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(UserConfiguration.class)
public class SpringVaultApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringVaultApplication.class);

    }
}