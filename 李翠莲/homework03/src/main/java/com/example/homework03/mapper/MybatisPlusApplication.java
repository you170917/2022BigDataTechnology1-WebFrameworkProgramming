package com.example.homework03.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages="com.example.mybatisplus.mapper")
@SpringBootApplication
public class MybatisPlusApplication {
    void publicstaticvoidmain(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}
