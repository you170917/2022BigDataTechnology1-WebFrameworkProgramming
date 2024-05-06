package com.example.demo04.controller;

import com.example.demo04.model.User;
import com.example.demo04.service.UserService;
import com.example.demo04.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/AllUsers")
    public Result getAllUsers(){
        List<User> userList = userService.list();
        if (!userList.isEmpty()){
            return Result.success(userList);
        }else {
            return Result.error("查询所有用户失败!");
        }
    }

    @GetMapping("/user/{id}")
    public Result getUserById(@PathVariable("id") Integer id){
        User byId = userService.getById(id);
        return Result.success(userService);
    }

    @PostMapping("/user")
    public Result addUser(@RequestBody User user){
        if (userService.save((user))){
            return Result.success("添加成功！");
        }else return Result.error("添加失败！");
    }

    @PutMapping("/user")
    public Result updateUser(@RequestBody User user){
        if (userService.updateById(user)){
            return Result.success("更新成功！");
        }else return Result.error("更新失败！");
    }

    @DeleteMapping("/user")
    public Result deleteUserById(Integer id){
        if (userService.removeById(id)){
            return Result.success("删除成功！");
        }else return Result.error("删除失败！");
    }
}
