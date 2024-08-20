package com.example.demo2.controller;

import com.example.demo2.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    Result RespBean;

    @GetMapping("/login")
    public Result login() {
        return RespBean.error("尚未登录，请登录");
    }
}
