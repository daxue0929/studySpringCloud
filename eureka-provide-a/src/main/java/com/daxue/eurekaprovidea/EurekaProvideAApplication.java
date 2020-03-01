package com.daxue.eurekaprovidea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Admin
 */
@SpringBootApplication
@EnableEurekaClient
class EurekaProvideAApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvideAApplication.class, args);
    }

}
