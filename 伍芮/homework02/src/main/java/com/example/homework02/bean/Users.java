package com.example.homework02.bean;

import lombok.Data;

@Data
public class Users {
    private Integer id;
    private String username;
    private String address;
    public Users(Integer id, String username, String address) {
        this.id = id;
        this.username = username;
        this.address = address;
    }

    public Users() {
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

    public void setGender(String address) {
        this.address = address;
    }
}
