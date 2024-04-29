package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.demo.bean.User;
import com.example.demo.service.userService;
import com.example.demo.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

//
//@RestController //复合注解，封装@Controller和@ResponseBody
////@RequestMapping("/User")
//public class UserController {
//
//    @Autowired
//    userService UserService;
//
//    /**
//     * 根据 id 查询指定用户
//     * @param id
//     * @return
//     */
//
//    @ApiOperation(value = "查询指定id的用户信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "用户的Id", required = true)
//    })
//    //    查询
//    @GetMapping("/Query/{id}")
////    @CrossOrigin(origins = "http://localhost:8080")
//    public User Query(@PathVariable("id") Integer id){
//        User user = UserService.getById(id);
//        return user;
//    }
//    //    listByIds（根据 ID 批量查询，返回一个 List）
////    listByMap（通过 Map 封装的条件查询，返回一个 List）
//
//    /**
//     * 查询所有用户
//     * @return
//     */
//
//    @ApiOperation(value = "查询所有用户信息")
//    @GetMapping("/AllUser")
////    @CrossOrigin(origins = "http://localhost:8080")
//    public List<User> QueryAllUser(){
//        List<User> list = UserService.list();
//        return list ;
//    }
//
//    /**
//     * 添加用户
//     * @param user
//     * @return
//     */
//
//    @ApiOperation(value = "添加用户信息")
//    @PostMapping("/UserAdd")
//    public String insertUser(@RequestBody User user){
//
//
//        if(UserService.save(user)){
//            return "添加成功";
//        }else return "添加失败" ;
//
//
//    }
//
//
//    /**
//     * 根据 id 修改指定用户
//     * @param user
//     * @return
//     */
//    @ApiOperation(value = "修改指定id的用户信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "user", value = "用户的user", required = true)
//    })
//    //    修改学生信息
//    @PutMapping("/UserUpdate")
//    public String updateUser(@RequestBody User user) {
//
//        if(UserService.updateById(user)){
//            return "修改成功！";
//        }else return "修改失败！";
//
//
//        /**
//         * 根据 id 删除指定用户
//         * @param id
//         * @return
//         */
//    }
//    @ApiOperation(value = "删除指定id的用户信息")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "id", value = "用户的Id", required = true)
//    })
//    //    删除学生信息
//    @DeleteMapping("/UserDelete")
//    public String removeUser( Integer id){
//        User user = new User();
//
//        user.setId(id);
//
//
//        if( UserService.removeById(user)){
//            return "删除成功！";
//        }else return "删除失败！";
//    }
//}

@RestController
@Api(tags = "用户管理相关接口")
public class UserController {
    @Autowired
    userService userService;
    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/AllUser")
    @ApiOperation("查询所有用户")
    public Result getAllUser(){
        List<User> userList = userService.list();
        if (!userList.isEmpty()){
            return Result.success(userList);
        }else {
            return Result.error("查询失败!");
        }
    }
    /**
     * 根据 id 查询指定用户
     * @param id
     * @return
     */
    @GetMapping("/Query/{id}")
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
    @PostMapping("/UserAdd")
    @ApiOperation(("插入用户"))
    public Result addUser(@RequestBody User user){
        if (userService.save(user)){
            return Result.success("插入成功！");
        }
        else return Result.error("插入失败");
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @PutMapping("/UserUpdate")
    @ApiOperation(("修改用户"))
    public Result updateUser(@RequestBody User user){
        if (userService.updateById(user)){
            return Result.success("更新成功！");
        }
        else return Result.error("更新失败");
    }
    /**
     * 删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/UserDelete")
    @ApiOperation(("删除用户"))
    public Result deleteUserById(Integer id) {
        if (userService.removeById(id)) {
            return Result.success("删除成功！");
        } else return Result.error("删除失败！");

    }
}