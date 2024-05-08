package com.example.homework10_.controller;

import com.example.homework10_.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/Login")
    public Result login(){
        return Result.error("尚未登录，请登录！");
    }
}
