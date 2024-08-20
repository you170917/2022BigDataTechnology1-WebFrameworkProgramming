package com.example.homework02;

import java.util.List;
import com.example.homework02.bean.em2;
import com.example.homework02.mapper.Usermapper;
import com.example.homework02.mapper.Usermapper1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Homework02ApplicationTests {

    @Autowired
    Usermapper Usermapper;

    @Autowired
    Usermapper1 Usermapper1;

    @Test

    void contextLoads() {
        List<em2> allUsers = Usermapper.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test1(){
        em2 user = Usermapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    void test2(){
        em2 users = new em2();
        users.setUsername("hello");
        users.setAge("SiChuan");
        Usermapper.addUser(users);
    }
    @Test
    void test3(){
        em2 users = new em2();
        users.setId(1);
        users.setUsername("youlinwei");
        Usermapper.updateUser(users);
    }
    @Test
    void test4(){
        Usermapper.deleteUser(4);
    }

    void test5(){
        List<em2> allUsers = Usermapper1.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test6(){
        em2 user = Usermapper1.getUserById(5);
        System.out.println(user);
    }
    @Test
    void test7(){
        em2 users = new em2();
        users.setUsername("hello");
        users.setAge("Spring!");
        Usermapper1.addUser(users);
    }
    @Test
    void test8(){
        em2 users = new em2();
        users.setId(6);
        users.setUsername("Spring");
        Usermapper1.updateUser(users);
    }
    @Test
    void test9(){
        Usermapper1.deleteUser(2);
    }

}
