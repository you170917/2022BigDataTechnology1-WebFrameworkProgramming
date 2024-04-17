package com.example.homework06.model;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.homework06.mapper") //需要修改为自己的包路径
@SpringBootApplication
public class ResTfulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResTfulApplication.class, args);
    }
}
