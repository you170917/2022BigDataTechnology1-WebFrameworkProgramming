package com.example.mybatis;

import com.example.mybatis.bean.Users;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.mapper.UserMapper1;
import org.junit.jupiter.api.Test;
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
        Users user = userMapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    void test2(){
        Users users = new Users();
        users.setUsername("赵丽颖");
        users.setAddress("河北");
        userMapper.addUser(users);
        System.out.println(users);
    }
    @Test
    void test3(){
        Users users = new Users();
        users.setId(7);
        users.setUsername("mjq");
        userMapper.updateUser(users);
    }
    @Test
    void test4(){
        userMapper.deleteUser(7);
        System.out.println("删除成功");
    }
    @Autowired
    UserMapper1 userMapper1;
    @Test
    void test5(){
        List<Users> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test6(){
        Users user = userMapper1.getUserById(6);
        System.out.println(user);
    }
    @Test
    void test7(){
        Users users = new Users();
        users.setUsername("hello");
        users.setAddress("Spring!");
        userMapper1.addUser(users);
        System.out.println(users);
    }
    @Test
    void test8(){
        Users users = new Users();
        users.setId(8);
        users.setUsername("刘耀文");
        users.setAddress("重庆");
        userMapper1.updateUser(users);
        System.out.println(users);
    }
    @Test
    void test9(){
        userMapper1.deleteUser(2);
    }
}