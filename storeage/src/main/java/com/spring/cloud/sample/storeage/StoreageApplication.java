package com.spring.cloud.sample.storeage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class StoreageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreageApplication.class, args);
    }

}
