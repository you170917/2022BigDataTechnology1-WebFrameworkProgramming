package com.example.demo5.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo5.model.User;
import com.example.demo5.mpper.UserMapper;
import com.example.demo5.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl extends ServiceImpl<UserMapper, User> implements UserService {
}
