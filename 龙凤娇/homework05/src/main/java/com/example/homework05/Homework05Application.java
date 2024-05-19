package com.example.homework05;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.homework05.mapper")

@SpringBootApplication
public class Homework05Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework05Application.class, args);
    }

}
