package com.example.homework05.controller;

import com.example.homework05.model.User;
import com.example.homework05.service.Userservice;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController{

    @Autowired
    Userservice userservice;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/AllUsers")
    @ApiOperation("查询所有用户")
    public List<User> getAllUsers(){
        List<User> userList = userservice.list();
        return userList;
    }


    /**
     * 根据 id 查询指定用户
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    @ApiOperation(("根据 id 查询指定用户"))
    public User getUserById(@PathVariable("id") Integer id){
        User user = userservice.getById(id);
        return user;
    }

    /**
     * 插入用户
     * @param user
     * @return
     */
    @PostMapping("/user")
    @ApiOperation(("插入用户"))
    public String addUser(@RequestBody User user){
        if(userservice.save(user)){
            return "添加用户成功！";
        }
        else return "添加用户失败！";
    }
    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @PutMapping("/user")
    @ApiOperation(("修改用户"))
    public String updateUser(@RequestBody User user){
        if(userservice.updateById(user)){
            return"修改用户成功！";
        }
        else return "添加用户失败！";
    }
    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/user")
    @ApiOperation(("删除用户"))
    public String deleteUser(Integer id){
        if(userservice.removeById(id)){
            return "删除用户成功！";
        }
        else return "添加用户失败！";
    }
}
