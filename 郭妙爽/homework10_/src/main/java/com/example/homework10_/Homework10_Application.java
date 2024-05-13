package com.example.homework10_;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.homework10_.mapper")
@SpringBootApplication
public class Homework10_Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework10_Application.class, args);
    }

}
