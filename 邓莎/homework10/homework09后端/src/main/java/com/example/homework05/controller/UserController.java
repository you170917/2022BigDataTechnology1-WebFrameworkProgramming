package com.example.homework05.controller;

import com.example.homework05.model.User;
import com.example.homework05.service.UserService;
import com.example.homework05.util.Result;
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
    @GetMapping("/AllUsers")
//    @CrossOrigin(origins = "http://localhost:8080")
    public Result getAllUsers(){
        List<User> userList = userService.list();
        if(!userList.isEmpty()){
            return Result.success(userList);
        }else {
            return Result.error("查询所有用户失败");
        }

    }

    /**
     * 根据id获取指定用户
     * @param id
     * @return
     */
    @ApiOperation("根据id获取指定用户")
    @GetMapping("/user/{id}")
    public Result getUserById(@PathVariable("id")Integer id){
        User user = userService.getById(id);
        return Result.success(user);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @ApiOperation("添加用户")
    @GetMapping("/user")
    public Result addUser(@RequestBody User user){
        if(userService.save(user)){
            return Result.success("添加成功！");
        }
        else return Result.error("添加失败！");
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @ApiOperation("修改用户")
    @GetMapping("/user")
    public Result updateUser(@RequestBody User user){
        if(userService.updateById(user)){
            return Result.success("修改成功！");
        }
        else return Result.error("修改失败！");
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @ApiOperation("删除用户")
    @GetMapping("/user")
    public Result deleteUser(Integer id){
        if(userService.removeById(id)){
            return Result.success("删除用户成功！");
        }
        else  return Result.error("删除失败！");
    }
}
