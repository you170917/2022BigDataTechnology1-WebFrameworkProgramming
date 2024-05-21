package com.example.restful;


import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;


@MapperScan(basePackages = "com.example.restful.mapper")
@SpringBootApplication

public class RestfulApplicationTests {
    @Test
    void contextLoads() {
    }
    public static void main(String[] args) {
        SpringApplication.run(RestfulApplicationTests.class, args);
    }

}



