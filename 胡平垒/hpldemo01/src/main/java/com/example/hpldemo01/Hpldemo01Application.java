package com.example.hpldemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.hpldemo01.mapper")
@SpringBootApplication
public class Hpldemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Hpldemo01Application.class, args);
    }

}
