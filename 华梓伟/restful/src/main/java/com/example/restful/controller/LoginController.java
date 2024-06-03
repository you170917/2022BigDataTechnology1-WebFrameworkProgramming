package com.example.restful.controller;


import com.example.restful.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LoginController {
    @GetMapping("/login")
    public Result login(){

        return Result.error("尚未登录，请登录！");
    }
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @GetMapping("/historyLoginInfo")
    public Result getHistoryLoginInfo(){
        ArrayList<String> list = new ArrayList<>();
        ListOperations<String, String> opsForList =
                stringRedisTemplate.opsForList();
        Long LoginInfo = opsForList.size("LoginInfo");
        for (int i=0; i<LoginInfo; i++){
            String loginInfo = opsForList.index("LoginInfo", i);
            list.add(loginInfo);
        }
        return Result.success(list);
    }

}
