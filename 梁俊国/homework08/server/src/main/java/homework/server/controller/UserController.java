package homework.server.controller;

import homework.server.config.Result;
import homework.server.model.UsersModel;
import homework.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/AllUsers")
    public Result getAllUsers(){
        List<UsersModel> userList = userService.list();
        if (!userList.isEmpty()){
            return Result.success(userList);
        }else {
            return Result.error("查询所有用户失败!");
        }
    }
    @GetMapping("/user/{id}")
    public Result getUserById(@PathVariable("id") Integer id){
        UsersModel user = userService.getById(id);
        return Result.success(user);
    }
    @PostMapping("/user")
    public Result addUser(@RequestBody UsersModel user){
        if (userService.save(user)){
            return Result.success("插入用户成功！");
        }
        else return Result.error("插入用户失败");
    }
    @PutMapping("/user")
    public Result updateUser(@RequestBody UsersModel user){
        if (userService.updateById(user)){
            return Result.success("更新用户成功！");
        }
        else return Result.error("更新用户失败");
    }
    @DeleteMapping("/user")
    public Result deleteUserById(Integer id){
        if (userService.removeById(id)){
            return Result.success("删除用户成功！");
        }
        else return Result.error("删除用户失败！");
    }
}