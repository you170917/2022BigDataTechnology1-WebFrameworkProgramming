package com.example.mybatisplusdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
