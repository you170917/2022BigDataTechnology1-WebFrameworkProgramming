package com.example.demo03.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class Student {
    @TableId(value="name",type = IdType.AUTO)
    private String name;
    private String password;
    private Integer age;
}
