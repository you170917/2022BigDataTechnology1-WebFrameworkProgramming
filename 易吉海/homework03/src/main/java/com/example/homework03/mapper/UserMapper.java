package com.example.homework03.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.homework03.bean.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> selectList(QueryWrapper<Object> queryWrapper);
}
