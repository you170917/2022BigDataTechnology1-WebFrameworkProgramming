package com.example.demo03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.demo03.mapper")
@SpringBootApplication
public class Demo03Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo03Application.class, args);
    }

}
