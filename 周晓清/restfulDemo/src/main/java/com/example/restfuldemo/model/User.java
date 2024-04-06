package com.example.restfuldemo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("user")
public class User {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private  String username;
    private String password;
}
