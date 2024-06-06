package com.example.demo5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demo5.mapper")
@SpringBootApplication
public class Demo5Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo5Application.class, args);


    }

}
