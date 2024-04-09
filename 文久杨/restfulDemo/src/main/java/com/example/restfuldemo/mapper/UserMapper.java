package com.example.restfuldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.restfuldemo.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public interface UserMapper  extends BaseMapper <User>{
}

