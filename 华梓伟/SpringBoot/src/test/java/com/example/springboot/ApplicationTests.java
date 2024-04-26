package com.example.springboot;

import com.example.springboot.bean.Users;
import com.example.springboot.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        List<Users> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);

}}
