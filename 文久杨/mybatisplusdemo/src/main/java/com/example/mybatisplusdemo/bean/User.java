package com.example.mybatisplusdemo.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId
    private Integer id;
    @TableId("username")
    private String username;
    private String address;
}
