package org.scpu.homework02;

import org.junit.jupiter.api.Test;
import org.scpu.homework02.entity.User;
import org.scpu.homework02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Homework02ApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void TestC(){
        userService.insert("admin","admin");
    }
    @Test
    void TestR(){
        List<User> list = userService.selectAll();
        System.out.println(list);
    }
    @Test
    void TestU(){
        userService.update("admin","admin");
    }
    @Test
    void TestD(){
        userService.delete("admin");
    }
    @Test
    void TestCRUD(){
        TestC();
        TestR();
        TestU();
        TestD();
    }
}
