package com.example.mybatisplusdemo1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplusdemo1.bean.User;
import com.example.mybatisplusdemo1.mapper.UserMapper;
import com.example.mybatisplusdemo1.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl extends ServiceImpl<UserMapper,User>implements UserService {
}
