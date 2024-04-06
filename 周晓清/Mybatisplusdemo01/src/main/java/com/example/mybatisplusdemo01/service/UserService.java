package com.example.mybatisplusdemo01.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplusdemo01.dean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserService extends IService<User> {
}
