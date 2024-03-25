package com.example.mybatisdemo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.example.mybatisdemo.mapper")
//@SpringBootApplication
public class MybatisDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisDemoApplication.class, args);
    }

}
