package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.demo.mapper")

@SpringBootApplication
public class Restfuldemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Restfuldemo01Application.class, args);
    }
}
