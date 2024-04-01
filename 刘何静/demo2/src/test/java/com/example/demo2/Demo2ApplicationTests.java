package com.example.demo2;

import com.example.demo2.bean.Users;
import com.example.demo2.mapper.UserMapper1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
class Demo2ApplicationTests {
    //xml方法
//    @Autowired(required = false)
//    UserMapper userMapper;
//
//    @Test
//    void contextLoads() {
//        List<Users> allUsers = userMapper.getAllUsers();
//        System.out.println(allUsers);
//    }
//    @Test
//    void test1(){
//        Users user = userMapper.getUserById(1);
//        System.out.println(user);
//    }
//    @Test
//    void test2(){
//        Users users = new Users();
//        users.setId(5);
//        users.setName("小芳");
//        users.setAge(24);
//        users.setGender("女");
//        userMapper.addUser(users);
//    }
//    @Test
//    void TextD(){
//        userMapper.deleteUser(1);
//    }
    //注解方法
    @Autowired(required = false)
    UserMapper1 userMapper1;
    @Test
    void contextLoads() {
        List<Users> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test1(){
        Users user = userMapper1.getUserById(1);
        System.out.println(user);
    }
    @Test
    void test2(){
        Users users = new Users();
        users.setName("小倩");
        users.setAge(29);
        users.setGender("女");
        userMapper1.addUser(users);
        System.out.println(users);
    }
    @Test
    void TextD() {
        userMapper1.deleteUser(2);
        System.out.println("成功删除");
    }
}
