package com.example.restfuldemo.controller;

import com.example.restfuldemo.model.User;
import com.example.restfuldemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers()
    {
        List<user> userList = userService.list();
        return userList;
    }
}

