//package com.example.homework09.controller;
//
//import com.example.homework09.service.UserService;
//import com.example.homework09.util.Result;
//import com.example.homework9.mapper.User;
//import com.example.homework9.service.UserService;
//import com.example.homework9.util.Result;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/user")
//@Api(tags = "用户管理相关接口")
//public class UserController {
//    @Autowired
//    UserService userService;
//    /**
//     * 查询所有用户
//     * @return
//     */
//
//    @GetMapping("/AllUsers")
//    @ApiOperation("查询所有用户")
//    public List<User> getAllUsers() {
//        List<com.example.homework09.mapper.User> userList = userService.List();
//        if (!userList.isEmpty()){
//            return (List<User>) Result.success(userList);
//        }else {
//            return (List<User>) Result.error("查询所有用户失败!");
//        }
//    }
//    /**
//     * 根据 id 查询指定用户
//     *
//     * @param id
//     * @return
//     */
//    @GetMapping("/user/{id}")
//    @ApiOperation("根据id查询指定用户")
//    public Result getUserById(@PathVariable("id") Integer id) {
//        User user = (User) userService.getById(id);
//        return Result.success(user);
//    }
//    /**
//     * 插入用户
//     * @param user
//     * @return
//     */
//    @PostMapping("/user")
//    @ApiOperation("插入用户")
//    public String addUser(@RequestBody User user){
//        com.example.homework09.mapper.User User = null;
//        if (userService.save(User)){
//            return Result.success("插入用户成功！").toString();
//        }
//        else return "插入用户失败";
//    }
//    /**
//     * 修改用户信息
//     * @param user
//     * @return
//     */
//    @PutMapping("/user")
//    @ApiOperation("修改用户")
//    public String updateUser(@RequestBody User user){
//        if (userService.updateById((com.example.homework09.mapper.User) user)){
//            return Result.success("更新用户成功！").toString();
//        }
//        else return Result.error("更新用户失败").toString();
//    }
//    /**
//     * 删除用户
//     * @param id
//     * @return
//     */
//    @DeleteMapping("/user")
//    @ApiOperation("删除用户")
//    public String deleteUserById(Integer id) {
//        if (userService.removeById(id)) {
//            return Result.success("删除用户成功！").toString();
//        }
//        else return Result.error("删除用户失败！").toString();
//    }
//}
//
