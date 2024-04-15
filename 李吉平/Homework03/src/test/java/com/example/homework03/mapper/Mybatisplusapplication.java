package com.example.homework03.mapper;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.mybatisplus.mapper")
@SpringBootApplication
public class Mybatisplusapplication {
    public static void main(String[] args) {
        SpringApplication.run(Mybatisplusapplication.class, args);
    }
}
