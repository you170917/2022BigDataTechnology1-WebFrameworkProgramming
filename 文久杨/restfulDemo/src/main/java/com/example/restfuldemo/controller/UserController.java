package com.example.restfuldemo.controller;

import com.example.restfuldemo.model.User;
import com.example.restfuldemo.service.UserService;
import com.example.restfuldemo.util.Result;
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
    @GetMapping("/test")
    public String test(){
        return "Test";
    }
    @GetMapping("/AllUsers")
    @CrossOrigin(origins = "http://localhost:8011")
    @ApiOperation("查询所有用户")
    public Result getAllUsers(){
        List<User> userList = userService.list();
        if (!userList.isEmpty()){
            return Result.success(userList);
        }else {
            return Result.error("查询所有用户失败!");
        }
    }
    @GetMapping("/user/{id}")
    @CrossOrigin(origins = "http://localhost:8011")
    @ApiOperation(("根据 id 查询指定用户"))
    public Result getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return Result.success(user);
    }
    @PostMapping("/user")
    @CrossOrigin(origins = "http://localhost:8011")
    @ApiOperation(("插入用户"))
    public Result addUser(@RequestBody User user){
        if (userService.save(user)){
            return Result.success("插入用户成功！");
        }
        else return Result.error("插入用户失败");
    }
    @PutMapping("/user")
    @CrossOrigin(origins = "http://localhost:8011")

    @ApiOperation(("修改用户"))
    public Result updateUser(@RequestBody User user){
        if (userService.updateById(user)){
            return Result.success("更新用户成功！");
        }
        else return Result.error("更新用户失败");
    }

    @DeleteMapping("/user")
    @CrossOrigin(origins = "http://localhost:8011")

    @ApiOperation(("删除用户"))
    public Result deleteUserById(Integer id){
        if (userService.removeById(id)){
            return Result.success("删除用户成功！");
        }
        else return Result.error("删除用户失败！");
    }
}
