package com.example.hll.controller;

import com.example.hll.model.User;
import com.example.hll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/AllUsers")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<User> getAllUsers() {
        return userService.list();
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        User user = userService.getById(id);
        return user;
    }
    @PostMapping("/user")
    public String addUser(@RequestBody User user) {
        if (userService.save(user)) {
            return "插入用户成功！";
        } else return "插入用户失败";
    }

    @PutMapping("/user")
    public String updateUser(@RequestBody User user) {
        if (userService.updateById(user)) {
            return "更新用户成功！";
        } else return "更新用户失败";
    }

    @DeleteMapping("/user")
    public String deleteUserById(Integer id) {
        if (userService.removeById(id)) {
            return "删除用户成功！";
        } else return "删除用户失败！";
    }
}

