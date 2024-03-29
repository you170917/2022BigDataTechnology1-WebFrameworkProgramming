package com.example.mybatisssql01.bean;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String address;

    public User() {
        this.id = id;
        this.username = username;
        this.address = address;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




}
