package com.example.restfuldemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(basePackages = "com.example.restfuldemo01.mapper")

@SpringBootApplication
public class Restfuldemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Restfuldemo01Application.class, args);
    }
}
