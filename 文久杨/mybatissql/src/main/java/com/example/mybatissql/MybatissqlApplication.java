package com.example.mybatissql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.mybatissql.mapper")
@SpringBootApplication
public class MybatissqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatissqlApplication.class, args);
    }

}
