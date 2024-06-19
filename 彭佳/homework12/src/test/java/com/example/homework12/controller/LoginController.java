package com.example.homework12.controller;

import com.example.homework12.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LoginController {



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
}
