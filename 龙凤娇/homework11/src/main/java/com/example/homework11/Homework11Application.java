package com.example.homework11;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.homework11.mapper")

@SpringBootApplication
public class Homework11Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework11Application.class, args);

    }


}
