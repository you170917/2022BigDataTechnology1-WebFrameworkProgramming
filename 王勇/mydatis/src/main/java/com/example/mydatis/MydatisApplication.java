package com.example.mydatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.mydatis.mapper")
@SpringBootApplication
public class MydatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MydatisApplication.class, args);
    }

}

