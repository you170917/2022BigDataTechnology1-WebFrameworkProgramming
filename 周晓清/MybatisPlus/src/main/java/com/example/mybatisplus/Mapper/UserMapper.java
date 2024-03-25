package com.example.mybatisplus.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public interface UserMapper extends BaseMapper<User> {
    @MapperScan(basePackages = "com.example.MybatisPlus.mapper")
    @SpringBootApplication
    public class MybatisPlusApplication {
        public static void main(String[] args) {
            SpringApplication.run(MybatisPlusApplication.class, args);
        }
    }
}
