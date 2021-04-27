package com.kepler.micro.consumer.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MicroConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroConsumerApplication.class,args);
    }
}
