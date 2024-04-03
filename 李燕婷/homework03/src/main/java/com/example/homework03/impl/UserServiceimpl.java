package com.example.homework03.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.homework03.bean.User;
import com.example.homework03.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.example.homework03.service.UserService;

@Service
public class UserServiceimpl extends ServiceImpl<UserMapper, User> implements UserService {

}
