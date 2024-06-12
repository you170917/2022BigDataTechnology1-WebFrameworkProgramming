package com.example.homework03.bean;

import lombok.Data;

@Data
//@TableName("user")
public class User {
    private Integer id;
    private String username;
    private String address;
}