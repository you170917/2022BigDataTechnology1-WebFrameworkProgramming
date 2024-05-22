package com.example.homework10_back01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class Homework10Back01ApplicationTests {

    @Test
    void contextLoads() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new
                BCryptPasswordEncoder();
        for (int i = 0; i < 2; i++) {
            System.out.println(bCryptPasswordEncoder.encode("123456"));
        }
    }
}
