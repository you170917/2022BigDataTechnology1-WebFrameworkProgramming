package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.userService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Scanner;

@MapperScan(basePackages = "com.example.demo.mapper")
@SpringBootTest
class DemoApplicationTests01 {

    @Autowired
    userService UserService;

    //    查询
    @Test
    public void Query(){
        User user = UserService.getById(3);
        System.out.println(user);
    }
//    listByIds（根据 ID 批量查询，返回一个 List）
//    listByMap（通过 Map 封装的条件查询，返回一个 List）
@Test
public void QueryAllUser(){
    List<User> list = UserService.list();
    for(User user : list){
        System.out.println(user);
    }
}

    @Test
    public void insertUser(){
        User user = new User();
        Scanner sc = new Scanner(System.in);
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

        UserService.save(user);
        QueryAllUser();
    }
//    修改学生信息
    @Test
    public void updateUser(){
        LambdaUpdateWrapper<User> LambdaUpdateWrapper = new LambdaUpdateWrapper<>();
        LambdaUpdateWrapper.eq(User::getId,5).set(User::getUsername,"小婷");
        boolean update1 = UserService.update(null, LambdaUpdateWrapper);
        QueryAllUser();
    }
//    删除学生信息
@Test
public void removeUser(){
    User user = new User();
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入要删除学生的学号");
    int i = scanner.nextInt();
    user.setId(i);
    UserService.removeById(user);
    QueryAllUser();
}
}
