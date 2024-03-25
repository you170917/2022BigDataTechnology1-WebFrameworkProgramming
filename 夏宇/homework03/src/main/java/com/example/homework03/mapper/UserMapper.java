package com.example.homework03.mapper;

import com.example.homework03.demos.web.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

public class UserMapper extends BaseMapper{
    }
@MapperScan(basePackages = "com.example.mybatisplus.mapper")
@SpringBootApplication
public class MybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}