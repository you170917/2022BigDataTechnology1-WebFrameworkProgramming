package com.example.homework03.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
 @TableId
 private Integer id;
 @TableField("username")
 private String username;
 private String address;
}

