package com.example.homework10_back01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.homework10_back01.mapper")
public class Homework10Back01Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework10Back01Application.class, args);
    }

}
