package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Data
@TableName("user")
public class User {
    @TableId
    @TableField("id")
    private Integer id;
    @TableField("username")
    private String username;
    @TableField("password")
    private String password;
}
