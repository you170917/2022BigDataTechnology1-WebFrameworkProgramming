package com.example.homework05.controller;

import com.baomidou.mybatisplus.core.injector.methods.DeleteById;
import com.example.homework05.model.User;
import com.example.homework05.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController  {
    @Autowired
    UserService userService;

    @GetMapping("/Allusers")
    public List<User> getAllUser(){
        return userService.list();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return user;
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        if (userService.save(user)){
            return "插入用户成功！";

        }
        else  return "插入用户失败！";
    }

    @DeleteMapping("/user")
    public  String deleteUserById(Integer id){
        if (userService.removeById(id)){
            return "删除用户成功！";
        }
        else return "删除用户失败！";
    }

}
