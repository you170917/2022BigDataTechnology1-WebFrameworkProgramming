package org.example.mybatisdemo001;

import org.example.mybatisdemo001.mapper.UserMapper;
import org.example.mybatisdemo001.mapper.UserMapper1;
import org.example.mybatisdemo001.pojo.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = Mybatisdemo001Application.class)
class Mybatisdemo001ApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserMapper1 userMapper1;

    @Test
    void contextLoads() {
        List<Users> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
    }


    @Test
    void test1(){
        Users userById = userMapper.getUserById(1);
        System.out.println(userById);
    }

    @Test
    void test2() {
        Users users = new Users();
        users.setUsername("wangwu");
        users.setPassword("123456");
        userMapper.addUser(users);
    }

    @Test
    void test3(){
        Users users = new Users();
        users.setId(1);
        users.setUsername("liuhanlin");
        userMapper.updateUser(users);
    }

    @Test
    void test4(){
        userMapper.deleteUser(4);
    }

    @Test
    void test5(){
        List<Users> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test6(){
        Users user = userMapper1.getUserById(1);
        System.out.println(user);
    }
    @Test
    void test7(){
        Users users = new Users();
        users.setUsername("hez");
        users.setPassword("123456");
        userMapper1.addUser(users);
    }
    @Test
    void test8(){
        Users users = new Users();
        users.setId(6);
        users.setUsername("Spring");
        userMapper1.updateUser(users);
    }
    @Test
    void test9(){
        userMapper1.deleteUser(2);
    }

}
