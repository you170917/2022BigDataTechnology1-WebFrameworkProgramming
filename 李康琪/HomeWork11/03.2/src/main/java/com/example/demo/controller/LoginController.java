package com.example.demo.controller;

import com.example.demo.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public Result login(){
        return Result.error("尚未登录，请登录！");
    }
}
