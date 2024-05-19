package com.example.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplusdemo.bean.User;
import com.example.mybatisplusdemo.mapper.UserMapper;
import com.example.mybatisplusdemo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceeImpl extends ServiceImpl<UserMapper, User>implements UserService {
}
