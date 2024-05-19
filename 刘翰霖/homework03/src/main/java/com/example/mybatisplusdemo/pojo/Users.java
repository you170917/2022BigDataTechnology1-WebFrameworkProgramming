package com.example.mybatisplusdemo.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_table")
public class Users {
    private int id;
    private String username;
    private String password;
}
