package com.example.homework11_back;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.homework11_back.mapper")
public class Homework11BackApplication {

    public static void main(String[] args) {
        SpringApplication.run(Homework11BackApplication.class, args);
    }

}
