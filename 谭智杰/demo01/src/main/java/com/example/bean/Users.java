package com.example.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("student")
public class Users {
    private String name;
    private String word;
    private Integer age;
}

