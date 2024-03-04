package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellcontroller {
    @GetMapping("/hello")
    public String hello(){
        return "你好，世界";
    }
}
