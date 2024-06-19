package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @RequestMapping("/admin/hello")
        public String hello1(){
            return "hello admin~";
        }
        @RequestMapping("/user/hello")
        public String hello2(){
            return "hello user!";
        }
    }

