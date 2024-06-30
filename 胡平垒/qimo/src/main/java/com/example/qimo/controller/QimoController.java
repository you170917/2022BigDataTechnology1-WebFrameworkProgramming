package com.example.qimo.controller;

import com.example.qimo.bean.Qimo;
import com.example.qimo.service.QimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class QimoController {
    @Autowired
    QimoService qimoService;


    @GetMapping("/AllQimo")
    public List<Qimo> getAllUsers(){
        return qimoService.list();
    }

    @PostMapping("/qimo")
    public String addUser(@RequestBody Qimo qimo){
        if (qimoService.save(qimo)){
            return "插入用户成功！";
        }
        else return "插入用户失败";
    }



}
