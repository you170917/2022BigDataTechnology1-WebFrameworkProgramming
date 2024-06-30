package com.example.homework11.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.homework11.mapper.User;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
public interface UserService extends IService<User> {
    List<User> List();
}
