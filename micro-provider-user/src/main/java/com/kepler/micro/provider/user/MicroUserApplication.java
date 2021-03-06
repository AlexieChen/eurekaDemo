package com.kepler.micro.provider.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/*import springfox.documentation.oas.annotations.EnableOpenApi;*/

//@EnableOpenApi
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.kepler.micro.provider.user.mapper")
public class MicroUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroUserApplication.class, args);
    }
}
