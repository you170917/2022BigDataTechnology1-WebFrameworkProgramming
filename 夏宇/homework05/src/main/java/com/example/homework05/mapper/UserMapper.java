package com.example.homework05.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages="com.example.restful.mapper")
@SpringBootApplication
public interface UserMapper extends BaseMapper<User>{
}
public class ResTfulApplication{
    public static void main(String[] args) {
        SpringApplication.run(ResTfulApplication.class, args);
    }
}
