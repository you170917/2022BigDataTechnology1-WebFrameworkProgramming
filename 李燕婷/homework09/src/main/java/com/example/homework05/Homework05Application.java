package com.example.homework05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.homework05.Mapper")
@EnableScheduling
@EnableAsync
@EnableCaching
public class Homework05Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework05Application.class, args);
    }

}
