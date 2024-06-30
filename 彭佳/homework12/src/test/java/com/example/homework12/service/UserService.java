package com.example.homework12.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.homework12.demos.web.User;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
public interface UserService extends IService<User> {
    List<User> List();
}
