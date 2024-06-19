package com.example.restful.controller;

import com.example.restful.model.LoginRequest;
import com.example.restful.model.User;
import com.example.restful.service.UserService;
import com.example.restful.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "用户管理相关接口")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/AllUsers")
    @CrossOrigin(origins = "http://localhost:8081")
    @ApiOperation("查询所有用户")
    public Result getAllUsers() {
        List<User> userList = userService.list();
        if (!userList.isEmpty()) {
            return Result.success(userList);
        } else {
            return Result.error("查询所有用户失败!");
        }
    }
    @GetMapping("/user/{id}")
    @CrossOrigin(origins = "http://localhost:8081")
    @ApiOperation(("根据 id 查询指定用户"))
    public Result getUserById(@PathVariable("id") Integer id) {
        User user = userService.getById(id);
        return Result.success(user);
    }
    @PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:8081")
    public Result Login(@RequestBody LoginRequest string){
        String username = string.username;
        String password = string.password;
        User[] users = userService.list().toArray(new User[0]);
        for (User us:users) {
            if (us.getUsername().equals(username)){
                if (us.getPassword().equals(password)){
                    return Result.success("登录成功");
                }else {
                    return Result.error("用户名或密码错误");
                }
            }
        }
        return Result.error("用户名没有发现");
    }
    @PostMapping("/user")
    @CrossOrigin(origins = "http://localhost:8081")
    @ApiOperation(("插入用户"))
    public Result addUser(@RequestBody User user) {
        if (userService.save(user)) {
            return Result.success("插入用户成功！");
        } else return Result.error("插入用户失败");
    }
    @PutMapping("/user")
    @CrossOrigin(origins = "http://localhost:8081")
    @ApiOperation(("修改用户"))
    public Result updateUser(@RequestBody User user) {
        if (userService.updateById(user)) {
            return Result.success("更新用户成功！");
        } else return Result.error("更新用户失败");
    }
    @DeleteMapping("/user")
    @CrossOrigin(origins = "http://localhost:8081")
    @ApiOperation(("删除用户"))
    public Result deleteUserById(Integer id) {
        if (userService.removeById(id)) {
            return Result.success("删除用户成功！");
        } else return Result.error("删除用户失败！");
    }

}
