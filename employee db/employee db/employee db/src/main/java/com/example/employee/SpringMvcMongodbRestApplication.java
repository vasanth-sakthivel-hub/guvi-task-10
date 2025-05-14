package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"employees"})

public class SpringMvcMongodbRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMvcMongodbRestApplication.class, args);
    }
}
