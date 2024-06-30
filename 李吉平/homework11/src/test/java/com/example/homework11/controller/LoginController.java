package com.example.homework11.controller;

import ch.qos.logback.classic.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public <RespBean> RespBean login(){
        Logger RespBean = null;

        return RespBean.error("尚未登录，请登录！");
    }
}
