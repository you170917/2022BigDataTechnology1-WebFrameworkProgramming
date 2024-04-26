package com.example.homework02;

import com.example.homework02.bean.User;
import com.example.homework02.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Homework02ApplicationTests {
    @Autowired
    UserMapper user;
    @Test
    void contextLoads() {
        List<User> allUsers = user.getAllUsers();
        System.out.println(allUsers);
    }

}
