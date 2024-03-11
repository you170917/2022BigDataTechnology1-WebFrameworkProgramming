package com.example.demo.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.example.mybatis.mapper")
@SpringBootApplication
public class MybatisApplicationTests {
    public static void main(String[] args) {
        SpringBootApplication.run(MybatisApplicationTests.class, args);
    }
}
