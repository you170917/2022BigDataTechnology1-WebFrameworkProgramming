package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.demo.bean.User;
import com.example.demo.service.userService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
public class UserController {

    @Autowired
    userService UserService;
    @GetMapping("/Query/{id}")
    public void Query(@PathVariable("id") Integer id){
        User user = UserService.getById(id);
        System.out.println(user);
    }
    @PostMapping("/AllUser")
    public List<User> QueryAllUser(){
        List<User> list = UserService.list();
        return list ;
    }

    @PostMapping("/UserAdd")
    public String insertUser(@RequestBody User user){


        if(UserService.save(user)){
            return "添加成功";
        }else QueryAllUser();return "添加失败" ;


    }
    @PostMapping("/User")
    public String updateUser(@RequestBody User user) {

        if(UserService.updateById(user)){
            return "修改成功！";
        }else return "修改失败！";


    }
    @PostMapping("/UserDel")
    public void removeUser(@PathVariable("id") Integer id){
        User user = new User();

        user.setId(id);
        UserService.removeById(user);
        QueryAllUser();
    }
}
