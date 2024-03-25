package com.example.demo02.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class User {
    @TableId
    private String name;
    @TableField("password")
    private String word;
    private Integer age;
}
