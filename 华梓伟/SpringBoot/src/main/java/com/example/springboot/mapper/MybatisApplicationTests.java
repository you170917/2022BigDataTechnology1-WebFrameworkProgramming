package com.example.springboot.mapper;

import com.example.springboot.bean.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class MybatisApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        List<Users> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
    }
}
