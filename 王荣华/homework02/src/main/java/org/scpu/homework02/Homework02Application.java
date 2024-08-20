package org.scpu.homework02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@MapperScan(value = {
        "org.scpu.homework02.dao"
})
@SpringBootApplication
public class Homework02Application {

    public static void main(String[] args) {
        SpringApplication.run(Homework02Application.class, args);
    }

}
