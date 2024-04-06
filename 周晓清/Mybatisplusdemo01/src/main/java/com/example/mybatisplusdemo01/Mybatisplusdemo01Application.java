package com.example.mybatisplusdemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.mybatisplusdemo01.mapper")
@SpringBootApplication
public class Mybatisplusdemo01Application {
    public static void main(String[] args) {
        SpringApplication.run(Mybatisplusdemo01Application.class, args);
    }
}
