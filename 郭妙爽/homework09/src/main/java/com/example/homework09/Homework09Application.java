package com.example.homework09;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.homework09.mapper")
@SpringBootApplication
public class Homework09Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework09Application.class, args);
    }

}
