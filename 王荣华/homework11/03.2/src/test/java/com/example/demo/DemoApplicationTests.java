package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.userService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.PublicKey;
import java.util.List;
import java.util.Scanner;

@MapperScan(basePackages = "com.example.demo.mapper")
@SpringBootTest
class DemoApplicationTests {


    @Autowired
    UserMapper UserMapper;
//    @Autowired
//    userService userService;
//
//    //    查询
//    @Test
//    public void Query(){
//        User user = userService.getById(3);
//        System.out.println(user);
//    }


//查询所有用户
    @Test
    public void QueryAllUsers(){
        List<User> users = UserMapper.selectList(null);
        for (User user : users){
            System.out.println(user);
        }
    }
//查询单个用户
    @Test
    public void QueryUser(){
        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        Integer id = sc.nextInt();
        user.setId(id);
        User user1 = UserMapper.selectById(user.getId());
        System.out.println(user1);
    }
    @Test
    public void insertUser(){
        User user = new User();
        Scanner sc = new Scanner(System.in);
//        输入id
        System.out.println("请输入你的学号：");
        Integer id = sc.nextInt();
        user.setId(id);
//        输入姓名
        System.out.println("请输入你的姓名：");
        String name = sc.next();
        user.setUsername(name);
//        输入密码
        System.out.println("请输入你的密码：");
        String psw = sc.next();
        user.setPassword(psw);

        UserMapper.insert(user);
            QueryAllUsers();
    }

//    修改学生
    @Test
    public void updataUser(){
//        UpdateWrapper<User> UW = new UpdateWrapper<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入学号");
//        int i = sc.nextInt();
//        UW.eq("id", i);
//
//        User user = new User();
//        //        输入id
//        System.out.println("请输入你的新学号：");
//        Integer id = sc.nextInt();
//        user.setId(id);
////        输入姓名
//        System.out.println("请输入你的新姓名：");
//        String name = sc.next();
//        user.setUsername(name);
////        输入密码
//        System.out.println("请输入你的新密码：");
//        String psw = sc.next();
//        user.setPassword(psw);
//
//        UserMapper.update(user,UW);
//        QueryAllUsers();

//        lamda方法

        LambdaUpdateWrapper<User> LambdaUpdateWrapper = new LambdaUpdateWrapper<>();
        LambdaUpdateWrapper.eq(User::getId,5).set(User::getUsername,"小孙");
        int update = UserMapper.update(null, LambdaUpdateWrapper);
//        "牛逼真好用！"

    }

    //    修改学生通过ID
    @Test
    public void updataUserById(){

        Scanner sc = new Scanner(System.in);
        User user = new User();
        //        输入id
        System.out.println("请输入你的新学号：");
        Integer id = sc.nextInt();
        user.setId(id);
//        输入姓名
        System.out.println("请输入你的新姓名：");
        String name = sc.next();
        user.setUsername(name);
//        输入密码
        System.out.println("请输入你的新密码：");
        String psw = sc.next();
        user.setPassword(psw);

        UserMapper.updateById(user);
        QueryAllUsers();
    }



//    删除用户
    @Test
    public void deleteUser(){
        QueryWrapper<User> QueryWrapper = new QueryWrapper<>();
        QueryWrapper.eq("id",1);
        UserMapper.delete(QueryWrapper);
    }

    @Test
    void contextLoads() {
    }

}
