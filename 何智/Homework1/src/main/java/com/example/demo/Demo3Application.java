package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo3Application {
    @RequestMapping("/116")
    String hello(){
        return "Hello word";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

}
