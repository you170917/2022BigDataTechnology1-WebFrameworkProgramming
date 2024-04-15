package com.example.homework5.controller;

import com.example.homework5.model.User;
import com.example.homework5.service.UserService;
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
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return user;
    }
    /**
     * 插入用户
     * @param user
     * @return
     */
    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        if (userService.save(user)){
            return "插入用户成功！";
        }
        else return "插入用户失败";
    }
    @PutMapping("/user")
    public String updateUser(@RequestBody User user){
        if (userService.updateById(user)){
            return "更新用户成功！";
        }
        else return "更新用户失败";
    }
    @DeleteMapping("/user")
    public String deleteUserById(Integer id){
        if (userService.removeById(id)){
            return "删除用户成功！";


        }
        else return "删除用户失败！";
    }
}