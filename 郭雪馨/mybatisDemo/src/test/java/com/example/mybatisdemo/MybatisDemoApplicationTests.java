package com.example.mybatisdemo;

import com.example.mybatisdemo.bean.User;
import com.example.mybatisdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserMapper userMapper1;
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
User user = new User();
user.setUsername("hello");
user.setAddress("SiChuan");
userMapper.addUser(user);
}
@Test
void test3(){
User user = new User();
user.setId(1);
user.setUsername("guoxuexin");
userMapper.updateUser(user);
}
@Test
void test4(){
userMapper.deleteUser(4);
}
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
User user = new User();
user.setUsername("hello");
user.setAddress("Spring!");
userMapper1.addUser(user);
}
@Test
void test8(){
User user = new User();
user.setId(6);
user.setUsername("Spring");
userMapper1.updateUser(user);
}
@Test
void test9(){
        userMapper1.deleteUser(2);
    }
}
