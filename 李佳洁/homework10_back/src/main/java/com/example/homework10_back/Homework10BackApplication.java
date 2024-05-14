package com.example.homework10_back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.homework10_back.mapper")
public class Homework10BackApplication {

    public static void main(String[] args) {
        SpringApplication.run(Homework10BackApplication.class, args);
    }

}
