package com.example.mybatis;

import com.example.mybatis.bean.Users;
import com.example.mybatis.mapper.mapperUser;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@MapperScan(basePackages = "com.example.mybatis.mapper")
@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    mapperUser mapperUser;
    @Test
    void contextLoads() {
        List<Users> allUsers = mapperUser.getAllUsers();
        System.out.println(allUsers);
    }

    @Test
    void test1(){
        Users user = mapperUser.getUserById(1);
        System.out.println(user);
    }
    @Test
    void test2(){
        Users users = new Users();
        users.setName("hello");
        users.setPassword("SiChuan");
        mapperUser.addUser(users);
    }

    @Test
    void test3(){
        Users users = new Users();
        users.setId(1);
        users.setName("youlinwei");
        mapperUser.modifyUser(users);
    }
    @Test
    void test4(){
        mapperUser.deleteUser(4);
    }

}
