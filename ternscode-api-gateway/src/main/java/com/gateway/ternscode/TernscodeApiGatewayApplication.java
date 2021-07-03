package com.gateway.ternscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TernscodeApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(TernscodeApiGatewayApplication.class, args);
    }

}
