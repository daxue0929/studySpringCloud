package com.daxue.microservicesdiscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesDiscoveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesDiscoveryEurekaApplication.class, args);

    }

}
