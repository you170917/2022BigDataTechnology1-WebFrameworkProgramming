package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.demo.bean.User;
import com.example.demo.service.userService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Scanner;

@MapperScan(basePackages = "com.example.demo.mapper")
@SpringBootTest
class DemoApplicationTests02 {
//    打印一下明文加密后的字符串
    @Test
    void contextLoads() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        for (int i = 0; i < 2; i++) {
            System.out.println(bCryptPasswordEncoder.encode("10086"));

//            $2a$10$JJ7mShWioESL0j5tCQLOCenn8uj1eC7U8MYOU0FZz4jIEyLtKU8D6
//            $2a$10$26eR8n35pQt5A78rsk3SmuZhOkUeycOBaVQkyp.Qy6uz8lcicOGr6

//            $2a$10$Mblto4wqU.w8IwGejDkF0Och71xbureSad/e.VKYBKqo4q1m2emL2
//            $2a$10$FXtDK1O4D2acDBr6sQXjB.c7GA9vAfajwbJ0uFcqkBnJYgFBRHbPu

//            $2a$10$omVzO4gPT0Gm8JM7mRm6YeaaeDuWnoKAtHYqVAi91oqvblvM1D/we
//            $2a$10$MBMU.rR8ljyC436D7RLQPu6.jzKSRpustLfs/elJnUiYWOVMb1vQ6
        }
    }
}

