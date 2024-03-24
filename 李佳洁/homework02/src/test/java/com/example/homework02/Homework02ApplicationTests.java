package com.example.homework02;

import com.example.homework02.bean.Users;
import com.example.homework02.mapper.UserMapper;
import com.example.homework02.mapper.UserMapper1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Homework02ApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<Users> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
    }

    @Test
    void test1() {
        Users user = userMapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    void test2() {
        Users users = new Users();
        users.setName("小兰");
        users.setAge(21);
        users.setGender("女");
        userMapper.addUser(users);
        System.out.println(users);
    }

    @Test
    void test3() {
        Users users = new Users();
        users.setId(1);
        users.setName("小郑");
        userMapper.updateUser(users);
        System.out.println(users);
    }

    @Test
    void test4() {
        userMapper.deleteUser(4);
        System.out.println("删除成功！");
    }
    @Autowired
    UserMapper1 userMapper1;

    @Test
    void contextLoads1() {
        List<Users> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
    }

    @Test
    void test5() {
        Users user = userMapper1.getUserById(5);
        System.out.println(user);
    }

    @Test
    void test6() {
        Users users = new Users();
        users.setName("小智");
        users.setAge(23);
        users.setGender("男");
        userMapper1.addUser(users);
        System.out.println(users);
    }

    @Test
    void test7() {
        Users users = new Users();
        users.setId(2);
        users.setName("小绿");
        userMapper1.updateUser(users);
        System.out.println(users);
    }

    @Test
    void test8() {
        userMapper1.deleteUser(3);
        System.out.println("删除成功！");
    }
}