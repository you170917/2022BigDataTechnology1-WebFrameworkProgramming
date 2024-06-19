package com.example.hd.controller;

import com.example.hd.config.Result;
import com.example.hd.model.user;
import com.example.hd.service.UserService;
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
    @GetMapping("/AllUsers")

    public Result getAllUsers(){
        List<user> userList = userService.list();
        if (!userList.isEmpty()){
            return Result.success(userList);
        }else {
            return Result.error("查询所有用户失败!");
        }
    }
    /**
     * 根据 id 查询指定用户
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")

    public Result getUserById(@PathVariable("id") Integer id){
        user user = userService.getById(id);
        return Result.success(user);
    }
    /**
     * 插入用户
     * @param user
     * @return
     */
    @PostMapping("/user")
    public Result addUser(@RequestBody user user){
        if (userService.save(user)){
            return Result.success("插入用户成功！");
        }
        else return Result.error("插入用户失败");
    }
    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @PutMapping("/user")
    public Result updateUser(@RequestBody user user){
        if (userService.updateById(user)){
            return Result.success("更新用户成功！");
        }
        else return Result.error("更新用户失败");
    }
    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/user")
    public Result deleteUserById(Integer id){
        if (userService.removeById(id)){
            return Result.success("删除用户成功！");
        }
        else return Result.error("删除用户失败！");
    }
}
