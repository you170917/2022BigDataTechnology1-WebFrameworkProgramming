package com.example.homework05.controller;

import com.example.homework05.model.User;
import com.example.homework05.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "用户相关接口")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 获取所有用户
     * @return
     */
    @ApiOperation("获取所有用户")
    @GetMapping("/AllUsers")
    public List<User> getAllUsers(){
        List<User> userlist = userService.list();
        return userlist;
    }

    /**
     * 根据id获取指定用户
     * @param id
     * @return
     */
    @ApiOperation("根据id获取指定用户")
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return user;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @ApiOperation("添加用户")
    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        if(userService.save(user)){
            return "插入用户成功！";
        }
        else return "插入用户失败";
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @ApiOperation("修改用户")
    @PutMapping("/user")
    public String updateUser(@RequestBody User user){
        if (userService.updateById(user)){
            return "更新用户成功！";
        }
        else return "更新用户失败";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @ApiOperation("删除用户")
    @DeleteMapping("/user")
    public String deleteUserById(Integer id){
        if (userService.removeById(id)){
            return "删除用户成功！";
        }
        else return "删除用户失败";
    }
}
