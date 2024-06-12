package com.example.homework5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.homework5.mapper")
public class Homework5Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework5Application.class, args);
    }

}
