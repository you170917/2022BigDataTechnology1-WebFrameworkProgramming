package com.example.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplusdemo.bean.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List selectList();
}
