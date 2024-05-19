package com.example.homework02.mapper;

import com.example.homework02.bean.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<Users> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test1(){
        Users user = UserMapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    void test2(){
        Users users = new Users();
        users.setUsername("hello");
        users.setAddress("SiChuan");
        userMapper.addUser(users);
    }
    @Test
    void test3(){
        Users users = new Users();
        users.setId(1);
        users.setUsername("youlinwei");
        userMapper.updateUser(users);
    }
    @Test
    void test4(){
        userMapper.deleteUser(4);
    }
    @Test
    void test5(UserMapper userMapper1){
        List<Users> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test6(){
        Users user = UserMapper.getUserById(5);
        System.out.println(user);
    }
    @Test
    void test7(){
        Users users = new Users();
        users.setUsername("hello");
        users.setAddress("Spring!");
        UserMapper1.addUser(users);
    }
    @Test
    void test8(){
        Users users = new Users();
        users.setId(6);
        users.setUsername("Spring");
        UserMapper userMapper1;
        UserMapper1.updateUser(users);
    }
    @Test
    void test9(){
        UserMapper1.deleteUser(2);
    }
}