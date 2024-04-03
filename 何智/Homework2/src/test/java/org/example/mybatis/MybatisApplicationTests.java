package org.example.mybatis;

import org.example.mybatis.bean.Users;
import org.example.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest(classes = MybatisApplication.class)


class MybatisApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserMapper userMapper1;
    @Test
    void contextLoads() {
        List<Users> allUsers = UserMapper.getAllUsers();
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
        users.setName("hello");
        users.setAddress("SiChuan");
        userMapper.addUser(users);
    }
    @Test
    void test3(){
        Users users = new Users();
        users.setId(1);
        users.setName("youlinwei");
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
        Users user = userMapper1.getUserById(5);
        System.out.println(user);
    }
    @Test
    void test7(){
        Users users = new Users();
        users.setName("hello");
        users.setAddress("Spring!");
        userMapper1.addUser(users);
    }
    @Test
    void test8(){
        Users users = new Users();
        users.setId(6);
        users.setName("Spring");
        userMapper1.updateUser(users);
    }
    @Test
    void test9(){
        userMapper1.deleteUser(2);
    }




}
