package com.example.mybatisplusdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public  String hello(){
        return "hello";
    }
}
