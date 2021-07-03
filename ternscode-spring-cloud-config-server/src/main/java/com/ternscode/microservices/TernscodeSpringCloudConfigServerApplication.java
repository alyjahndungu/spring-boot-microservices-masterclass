package com.ternscode.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TernscodeSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TernscodeSpringCloudConfigServerApplication.class, args);
    }

}
