package com.example.homework03.service.impl;

import com.example.homework03.bean.User;
import com.example.homework03.mapper.UserMapper;
import com.example.homework03.service.UserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service
public class UserServiceimpl extends ServiceImpl<UserMapper, User> implements UserService {
}
