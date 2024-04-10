package com.example.homework05.controller;

import com.example.homework05.model.User;
import com.example.homework05.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController  {
    @Autowired
    UserService userService;

    @GetMapping("/Allusers")
    public List<User> getAllUser(){
        return userService.list();
    }
}
