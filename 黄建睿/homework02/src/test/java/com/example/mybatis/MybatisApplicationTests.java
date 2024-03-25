package com.example.mybatis;

import com.example.mybatis.bean.User;
import com.example.mybatis.mapper.Usermapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    Usermapper usermapper;
    @Test
    void contextLoads() {
        List<User> allUser = usermapper.getAllUser();
        System.out.println(allUser);
    }
    @Test
    void test1(){
        User user = usermapper.getAllUser(1);
        System.out.println(user);
    }
    @Test
    void test2(){
        User users = new User();
        users.setUsername("hello");
        users.setAddress("SiChuan");
        usermapper.addUser(users);
    }
    @Test
    void test3(){
        User users = new User();
        users.setId(1);
        users.setUsername("youlinwei");
        usermapper.updateUser(users);
    }
    @Test
    void test4(){
        usermapper.deleteUser(4);
    }
}


