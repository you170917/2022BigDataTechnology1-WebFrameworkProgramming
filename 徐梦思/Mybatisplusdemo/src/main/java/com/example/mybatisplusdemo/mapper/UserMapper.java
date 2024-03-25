package com.example.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplusdemo.bean.User;

import java.awt.*;

public interface UserMapper extends BaseMapper<User> {
    List selectList();
}
