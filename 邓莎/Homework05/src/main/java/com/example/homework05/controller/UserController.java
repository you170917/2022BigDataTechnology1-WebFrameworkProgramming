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
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 获取所有用户
     * @return
     */
    @ApiOperation("获取所有用户")
    @GetMapping("/all")
    public List<User> getAllUsers(){
        List<User> userList = userService.list();
        return userList;
    }

    /**
     * 根据id获取指定用户
     * @param id
     * @return
     */
    @ApiOperation("根据id获取指定用户")
    @GetMapping("/tps/{id}")
    public User getUserById(@PathVariable("id")Integer id){
        User user = userService.getById(id);
        return user;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @ApiOperation("添加用户")
    @GetMapping("/add")
    public String addUser(@RequestBody User user){
        if(userService.save(user)){
            return "添加成功！";
        }
        else return "添加失败！";
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @ApiOperation("修改用户")
    @GetMapping("/update")
    public String updataUser(@RequestBody User user){
        if(userService.updateById(user)){
            return "修改成功！";
        }
        else return "修改失败！";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @ApiOperation("删除用户")
    @GetMapping("/delete")
    public String deleteUser(Integer id){
        if(userService.removeById(id)){
            return "删除成功！";
        }
        else  return "删除失败！";
    }
}
