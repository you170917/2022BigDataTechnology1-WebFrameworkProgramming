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
    @Autowired(required = false)
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<Users> allusers = userMapper.getAllUsers();
        System.out.println(allusers);
    }

    @Test
    void test1(){
        Users user = userMapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    void test2(){
        Users users = new Users();
        users.setName("xiaohong");
        users.setAge(10);
        users.setGender("女");
        userMapper.addUser(users);
        System.out.println(users);
    }

    @Test
    void test3(){
        Users users = new Users();
        users.setId(1);
        users.setName("kk");
        userMapper.updateUser(users);
        System.out.println(users);
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
        List<Users> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
    }

    @Test
    void test6(){
        Users user = userMapper1.getUserById(5);
        System.out.println(user);
    }

    @Test
    void test7(){
        Users users = new Users();
        users.setName("he");
        users.setAge(19);
        users.setGender("男");
        userMapper1.addUser(users);
        System.out.println(users);
    }

    @Test
    void test8(){
        Users users = new Users();
        users.setId(6);
        users.setName("Spring");
        userMapper1.updateUser(users);
        System.out.println(users);
    }

    @Test
    void test9(){
        userMapper1.deleteUser(2);
        System.out.println("删除成功");
    }
}
