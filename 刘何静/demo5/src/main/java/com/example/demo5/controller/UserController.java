package com.example.demo5.controller;

import com.example.demo5.model.User;
import com.example.demo5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    /**
     * 查询所有用户
     * @return
     */
    @PostMapping("/user/all")
    @CrossOrigin(origins = "http://localhost:8080")
    public List<User> getAllUsers(){
        return userService.list();
    }
    /**
     * 根据 id 查询指定用户
     * @param id
     * @return
     */
    @GetMapping("/user/get/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return user;
    }
    /**
     * 插入用户
     * @param user
     * @return
     */
    @PostMapping("/user/add")
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
    @PostMapping("/user/up")
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
    @PostMapping("/user/del")
    public String deleteUserById(Integer id){
        if (userService.removeById(id)){
            return "删除用户成功！";
        }
        else return "删除用户失败！";
    }
}
