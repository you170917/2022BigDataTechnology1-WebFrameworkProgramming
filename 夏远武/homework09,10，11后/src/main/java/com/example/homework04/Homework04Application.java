package com.example.homework04;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan(basePackages = "com.example.homework04.mapper")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Homework04Application {
    public static void main(String[] args) {
        SpringApplication.run(Homework04Application.class, args);
      }
}
