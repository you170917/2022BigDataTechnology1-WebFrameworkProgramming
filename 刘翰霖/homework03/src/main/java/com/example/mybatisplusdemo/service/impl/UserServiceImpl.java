package com.example.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplusdemo.mapper.Usermapper;
import com.example.mybatisplusdemo.pojo.Users;
import com.example.mybatisplusdemo.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<Usermapper, Users> implements UserService{
}
