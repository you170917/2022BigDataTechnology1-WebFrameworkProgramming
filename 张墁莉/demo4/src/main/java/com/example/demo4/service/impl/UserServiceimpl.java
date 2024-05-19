package com.example.demo4.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo4.model.User;
import com.example.demo4.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.example.demo4.service.UserService;
@Service
public class UserServiceimpl extends ServiceImpl<UserMapper, User> implements UserService
{
}
