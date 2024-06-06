package com.example.demo4.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo4.mapper.UserMapper;
import com.example.demo4.model.User;
import com.example.demo4.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements
        UserService {
}
