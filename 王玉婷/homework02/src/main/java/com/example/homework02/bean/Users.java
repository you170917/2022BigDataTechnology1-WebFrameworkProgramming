package com.example.homework02.bean;

import lombok.Data;

@Data
public class Users {
    private Integer id;
    private String user;
    private String address;
    public Users() {
        this.id = id;
        this.user = user;
        this.address = address;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
