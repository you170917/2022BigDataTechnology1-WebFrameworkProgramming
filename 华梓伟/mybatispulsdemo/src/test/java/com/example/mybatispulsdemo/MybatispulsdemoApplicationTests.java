package com.example.mybatispulsdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatispulsdemo.Mapper.UserMapper;
import com.example.mybatispulsdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatispulsdemoApplicationTests {
@Autowired
UserMapper usermapper;
    @Test
    void contextLoads() {
        List<User> users = usermapper.selectList(null);
        System.out.println();
    }


@Test
void test1(){
    User user = new User();
    user.setId(3);
    user.setUsername("hello");
    user.setAddress("5d501");
    usermapper.insert(user);
}
@Test
void test2(){
    QueryWrapper<User> wrapper = new QueryWrapper<>();
    wrapper.eq("username", "李四");
    usermapper.delete(wrapper);

}
@Test
    void test3(){
    User user = new User();
    user.setId(3);
    user.setAddress("502");
    usermapper.updateById(user);
}
}