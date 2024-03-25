package org.example.mybatisplusdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.example.mybatisplusdemo.bean.User;
import org.example.mybatisplusdemo.mapper.UserMapper;
import org.example.mybatisplusdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusdemoApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        List<User> users=userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void  test01() {
        User user = new User();
        user.setId(4);
        user.setName("张三");
        user.setAddress("四川");
        userMapper.insert(user);
    }
    @Test
    void test02(){
        User user=new User();
        user.setId(1);
        user.setAddress("5d501");
        userMapper.updateById(user);
    }
    @Test
    void test03(){
        User user=userMapper.selectById(1);
        System.out.println(user);
    }
    @Test
    void test04(){
       QueryWrapper<User> wrapper= new QueryWrapper<>();
       wrapper.eq("address","5d401");
       userMapper.delete(wrapper);
    }
    @Test
    void test05(){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id","2");//eq等于
        List<User> users=userMapper.selectList(queryWrapper);
        System.out.println(users);
    }
    @Test
    void test06(){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.ne("id","2");//ne不等于,gt大于,lt小于
        List<User> users=userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }






    @Test
    void test09(){
        List<User> list = userService.list();
        for (User user:list){
            System.out.println(user);
        }

    }
    @Test
    void test10(){
        User user=new User();
        user.setName("hello");
        user.setAddress("5教");
        userService.save(user);
    }
}
