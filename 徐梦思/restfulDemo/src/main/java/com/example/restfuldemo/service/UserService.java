package com.example.restfuldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.restfuldemo.model.User;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> List();
}
