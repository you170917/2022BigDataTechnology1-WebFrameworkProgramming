package com.example.restfuldemo01.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")

public class User {
    private int id;
    private String username;
    private String address;
}
