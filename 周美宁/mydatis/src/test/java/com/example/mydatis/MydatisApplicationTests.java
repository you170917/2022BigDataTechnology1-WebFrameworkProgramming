package com.example.mydatis;

import com.example.mydatis.bean.users;
import com.example.mydatis.mapper.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class MydatisApplicationTests {

    @Autowired
    userMapper userMapper;

    @Test
    void contextLoads() {
        List<users> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void text1(){
        users users = userMapper.getUserById(1);
        System.out.println(users);
    }

    @Test
    void text2(){
        users users = new users();
        users.setUsername("hello");
        users.setAddress("22大数据");
        userMapper.addUser(users);
    }
    @Test
    void text3(){
        users users = new users();
        users.setId(1);
        users.setUsername("wy");
        userMapper.updateUser(users);
    }
    @Test
    void text4(){
        userMapper.deleteUser(4);
    }

}
