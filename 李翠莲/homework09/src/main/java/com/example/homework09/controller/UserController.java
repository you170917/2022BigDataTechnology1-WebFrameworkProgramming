package com.example.homework09.controller;

import com.example.homework09.model.User;
import com.example.homework09.util.Result;
import com.example.homework09.service.impl.UserService;
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
    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/AllUsers")
    @ApiOperation("查询所有用户")
    public Result getAllUsers(){
        List<User> userList = userService.list();
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
    @ApiOperation(("根据 id 查询指定用户"))
    public Result getUserById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        return Result.success(user);
    }
    /**
     * 插入用户
     * @param user
     * @return
     */
    @PostMapping("/user")
    @ApiOperation(("插入用户"))
    public Result addUser(@RequestBody User user){
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
    @ApiOperation(("修改用户"))
    public Result updateUser(@RequestBody User user){
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
    @ApiOperation(("删除用户"))
    public Result deleteUserById(Integer id){
        if (userService.removeById(id)){
            return Result.success("删除用户成功！");
        }
        else return Result.error("删除用户失败！");
    }
}
