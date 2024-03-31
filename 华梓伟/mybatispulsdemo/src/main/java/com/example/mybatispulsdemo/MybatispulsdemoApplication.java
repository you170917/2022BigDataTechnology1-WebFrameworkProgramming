package com.example.mybatispulsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages= "com.example.mybatispulsdemo.Mapper")
@SpringBootApplication
public class MybatispulsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatispulsdemoApplication.class, args);
    }

}
