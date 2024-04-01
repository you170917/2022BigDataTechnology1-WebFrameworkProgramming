package com.example.mybatisssql01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.mybatisssql01.mapper")
@SpringBootApplication
public class Mybatisssql01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatisssql01Application.class, args);
    }

}
