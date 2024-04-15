package com.example.restfuldemo.controller;

import com.example.restfuldemo.model.User;
import com.example.restfuldemo.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @ApiOperation(("查询所有用户"))
    @GetMapping("/AllUsers")
    public List<User> getAllUsers(){
        List<User> userList=userService.list();
        return userList;
    }
    @ApiOperation(("根据id查询指定用户"))
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return user;
    }
    @ApiOperation(("插入用户"))
    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        if (userService.save(user)){
            return "添加用户成功";
        }
        else return "添加用户失败";
    }
    @ApiOperation(("修改用户"))
    @PutMapping("/user")
    public String updateUser(@RequestBody User user){
        if (userService.updateById(user)){
            return "修改成功";
        }
        else return "修改失败";
    }
    @ApiOperation(("删除用户"))
    @DeleteMapping("/user")
    public String deleteUser(Integer id){
        if (userService.removeById(id)){
            return "删除成功";
        }
        else return "删除失败";
    }
}
