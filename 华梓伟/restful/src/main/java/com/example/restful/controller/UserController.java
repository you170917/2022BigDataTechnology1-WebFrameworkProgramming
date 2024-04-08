package com.example.restful.controller;

import com.example.restful.model.User;
import com.example.restful.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/AllUsers")
    public List<User> getAllusers() {
        List<User> userList = userService.list();
        return userList;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        User user = userService.getById(id);
        return user;
    }

    @PostMapping("/user")
    @ApiOperation(("插入用户"))
    public String addUser(@RequestBody User user) {
        if (userService.save(user)) {
            return "插入用户成功！";
        } else return "插入用户失败";
    }


    @PutMapping("/user")
    @ApiOperation(("修改用户"))
    public String updateUser(@RequestBody User user) {
        if (userService.updateById(user)) {
            return "更新用户成功！";
        } else return "更新用户失败";
    }


    @DeleteMapping("/user")
    @ApiOperation(("删除用户"))
    public String deleteUserById(Integer id) {
        if (userService.removeById(id)) {
            return "删除用户成功！";
        } else return "删除用户失败！";
    }
}
