package com.example.mybatisplusdemo.controller;

import com.example.mybatisplusdemo.bean.User;
import com.example.mybatisplusdemo.service.impl.UserServicelmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public String getAllUsers(){
        List<User> userList=userService.List();
        String string=userList.toString();
        return string;
    }
}
