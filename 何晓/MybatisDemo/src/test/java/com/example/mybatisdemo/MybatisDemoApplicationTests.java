package com.example.mybatisdemo;

import com.example.mybatisdemo.bean.Users;
import com.example.mybatisdemo.mapper.UserMapper;
import com.example.mybatisdemo.service.impl.UserService;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {

//    @Autowired
//    UserService userService;
//
//    @Test
//    void test8(){
//        User user = userService.getById(3);
//        System.out.println(user);
//    }
//
//    @Test
//    void test7(){
//        User user = new User();
//        user.setUsername("hello");
//        user.setAddress("Web框架编程");
//        userService.save(user);
//    }


    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<Users> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);

    }
//
}
