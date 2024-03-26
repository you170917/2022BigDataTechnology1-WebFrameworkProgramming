package com.example.homework03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.homework03.mapper")
@SpringBootApplication
public class Homework03Application {

    public static void main(String[] args) {

        SpringApplication.run(Homework03Application.class, args);
    }

}
