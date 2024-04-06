package com.example.restfuldemo.controller;

import com.example.restfuldemo.model.User;
import com.example.restfuldemo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    /**
     * 查询所有用户
     * @return
     */

    @GetMapping("/AllUsers")
    @ApiOperation("查询所有用户")
    public List<User> getAllUsers(){
        return userService.list();
    }
    /**
     * 根据 id 查询指定用户
     * @param id
     * @return
     */

    @GetMapping("/user/{id}")
    @ApiOperation(("根据 id 查询指定用户"))
    public User getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return user;
    }
    /**
     * 插入用户
     * @param user
     * @return
     */
    @ApiOperation("添加用户")
    @PostMapping("/user")
    public String addUser(@RequestBody User user){
        if (userService.save(user)){
            return "插入用户成功！";
        }
        else return "插入用户失败";
    }
    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @ApiOperation("修改")
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
    @DeleteMapping("/user")
    @ApiOperation(("删除用户"))
    public String deleteUserById(Integer id){
        if (userService.removeById(id)){
            return "删除用户成功！";
        }
        else return "删除用户失败！";
    }
}