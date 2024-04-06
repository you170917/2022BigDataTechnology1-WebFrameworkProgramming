package com.example.mybatisplusdemo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplusdemo01.dean.User;
import com.example.mybatisplusdemo01.mapper.UserMapper;
import com.example.mybatisplusdemo01.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
