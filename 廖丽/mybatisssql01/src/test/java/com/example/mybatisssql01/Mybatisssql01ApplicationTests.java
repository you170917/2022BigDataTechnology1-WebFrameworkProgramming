package com.example.mybatisssql01;

import com.example.mybatisssql01.bean.User;
import com.example.mybatisssql01.mapper.UserMapper;
import com.example.mybatisssql01.mapper.UserMapper1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisssql01ApplicationTests {
    @Autowired(required = false)
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
    }

    @Test
    void test1(){
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    void test2(){
        User users = new User();
        users.setUsername("hello");
        users.setAddress("SiChuan");
        userMapper.addUser(users);
    }
    @Test
    void test3(){
        User users = new User();
        users.setId(1);
        users.setUsername("liaoxiaoli");
        userMapper.updateUser(users);
    }
    @Test
    void test4(){
        userMapper.deleteUser(4);
        System.out.println("删除成功");
    }

    @Autowired(required = false)
    UserMapper1 userMapper1;
    @Test
    void test5(){
        List<User> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test6(){
        User user = userMapper1.getUserById(5);
        System.out.println(user);
    }
    @Test
    void test7(){
        User users = new User();
        users.setUsername("hello");
        users.setAddress("Spring!");
        userMapper1.addUser(users);
    }
    @Test
    void test8(){
        User users = new User();
        users.setId(6);
        users.setUsername("Spring");
        userMapper1.updateUser(users);
    }
    @Test
    void test9(){
        userMapper1.deleteUser(2);
        System.out.println("删除成功");
    }
}
