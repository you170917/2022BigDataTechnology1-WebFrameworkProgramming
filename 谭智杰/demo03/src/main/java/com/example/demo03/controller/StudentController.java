package com.example.demo03.controller;

import com.example.demo03.model.Student;
import com.example.demo03.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "用户管理相关接口")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/AllUsers")
    @ApiOperation("查询所有用户")
    public List<Student> getAllStudents() {
        List<Student> list = studentService.list();
        return list;
    }

    @ApiOperation(("根据 name 查询指定用户"))
    @GetMapping("/student/{name}")
    public Student getStudentById(@PathVariable("name") String name) {
        Student byId = studentService.getById(name);
        return byId;
    }

    @ApiOperation(("添加用户"))
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        if (studentService.save(student)){
            return "添加成功";
        }
        else
            return "添加失败";
    }

    @ApiOperation(("修改用户"))
    @PutMapping("/student")
    public String updateStudent(@RequestBody Student student){
        if (studentService.updateById(student)){
            return "修改成功";
        }else return "修改失败";
    }

    @ApiOperation(("根据 name 删除指定用户"))
    @DeleteMapping("/student")
    public String deleteStudent(String name){
        if (studentService.removeById(name)){
            return "删除成功";
        }else return "删除失败";
    }
}
