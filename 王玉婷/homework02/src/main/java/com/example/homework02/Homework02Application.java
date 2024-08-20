package com.example.homework02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.homework02.mapper")
@SpringBootApplication
public class Homework02Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework02Application.class, args);
    }

}
