package org.example.mybatisdemo001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jmx.export.annotation.ManagedNotification;

@MapperScan(basePackages = "org.example.mybatisdemo001.mapper")

@SpringBootApplication
public class Mybatisdemo001Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatisdemo001Application.class, args);
    }

}
