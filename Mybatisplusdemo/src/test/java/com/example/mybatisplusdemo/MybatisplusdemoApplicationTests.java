package com.example.mybatisplusdemo;

import com.example.mybatisplusdemo.Mapper.UserMapper;
import com.example.mybatisplusdemo.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusdemoApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
     void contextLoads() {
        List<User> users = userMapper.selectList(null);
         users.forEach(System.out::println);
  }

}


