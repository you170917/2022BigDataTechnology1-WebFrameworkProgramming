package org.example.mybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "org.example.mybatisplusdemo.mapper")
@SpringBootApplication
public class MybatisPlusdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusdemoApplication.class, args);
    }

}
