package com.example.demo4.controller;

import com.example.demo4.model.User;
import com.example.demo4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/AllUsers")
    public List<User> getAllUsers(){
        return userService.list();
    }



}