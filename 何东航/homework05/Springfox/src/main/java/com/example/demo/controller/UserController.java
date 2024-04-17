package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.example.demo.bean.User;
import com.example.demo.service.userService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;


@RestController //复合注解，封装@Controller和@ResponseBody
//@RequestMapping("/User")
public class UserController {

    @Autowired
    userService UserService;

    /**
     * 根据 id 查询指定用户
     * @param id
     * @return
     */

    @ApiOperation(value = "查询指定id的用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户的Id", required = true)
    })
    //    查询
    @GetMapping("/Query/{id}")
    public void Query(@PathVariable("id") Integer id){
        User user = UserService.getById(id);
        System.out.println(user);
    }
    //    listByIds（根据 ID 批量查询，返回一个 List）
//    listByMap（通过 Map 封装的条件查询，返回一个 List）

    /**
     * 查询所有用户
     * @return
     */

    @ApiOperation(value = "查询所有用户信息")
    @GetMapping("/AllUser")
    public List<User> QueryAllUser(){
        List<User> list = UserService.list();
        return list ;
    }

    /**
     * 添加用户
     * @param user
     * @return
     */

    @ApiOperation(value = "添加用户信息")
    @PostMapping("/UserAdd")
    public String insertUser(@RequestBody User user){


        if(UserService.save(user)){
            return "添加成功";
        }else QueryAllUser();return "添加失败" ;


    }


    /**
     * 根据 id 修改指定用户
     * @param user
     * @return
     */
    @ApiOperation(value = "修改指定id的用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户的user", required = true)
    })
    //    修改学生信息
    @PutMapping("/User")
    public String updateUser(@RequestBody User user) {

        if(UserService.updateById(user)){
            return "修改成功！";
        }else return "修改失败！";


        /**
         * 根据 id 删除指定用户
         * @param id
         * @return
         */
    }
    @ApiOperation(value = "删除指定id的用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户的Id", required = true)
    })
    //    删除学生信息
    @DeleteMapping("/User")
    public void removeUser(@PathVariable("id") Integer id){
        User user = new User();

        user.setId(id);
        UserService.removeById(user);
        QueryAllUser();
    }
}
