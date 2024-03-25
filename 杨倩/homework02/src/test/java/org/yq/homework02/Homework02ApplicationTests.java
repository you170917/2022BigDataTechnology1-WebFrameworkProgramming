package org.yq.homework02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.yq.homework02.entity.User;
import org.yq.homework02.service.UserService;

import java.util.List;

@SpringBootTest
class Homework02ApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void TestC(){
        List<User> list= userService.selectAll();
        System.out.println(list);
    }
    @Test
    void test1(){
        User user = userService.selectByUsername("小刘");
        System.out.println(user);
    }
    @Test
    void test2(){
        User users = new User();
        users.setName("小张");
        users.setAge(20);
        users.setGender("男");
        userService.insert(users);
    }

}