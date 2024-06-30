package com.example.homework05;

//import jdk.internal.joptsimple.internal.SimpleOptionNameMap;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class Homework05ApplicationTests {

    @Test
    void contextLoads() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
 //       for (int i = 0; i<2; i++){
            System.out.println(bCryptPasswordEncoder.encode("123456"));
 //       }
    }

}
