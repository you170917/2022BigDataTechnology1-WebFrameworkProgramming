package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/admin/hello")
    public String hello1(){
        return "hello admin~";
   }
    @GetMapping("/user/hello")
    public String hello2(){
        return "hello user!";
   }
}
