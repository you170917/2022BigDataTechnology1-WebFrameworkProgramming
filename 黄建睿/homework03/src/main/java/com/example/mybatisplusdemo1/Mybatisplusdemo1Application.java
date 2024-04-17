package com.example.mybatisplusdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.example.mybatisplusdemo1.mapper")
@SpringBootApplication
public class Mybatisplusdemo1Application {
    public static void main(String[] args) {
        SpringApplication.run(Mybatisplusdemo1Application.class, args);
    }

}
