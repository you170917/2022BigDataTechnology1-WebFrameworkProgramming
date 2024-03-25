package com.example.mybatis.bean;

import lombok.Data;
import org.springframework.stereotype.Repository;
@Data
@Repository

public class Users {
    private Integer id;
    private String name;
    private String password;
}
