package com.tistory.jaimemin.firstservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class FirstServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstServiceApplication.class, args);
    }

}
