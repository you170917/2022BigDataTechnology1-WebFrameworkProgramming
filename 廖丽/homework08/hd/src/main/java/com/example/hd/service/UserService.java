package com.example.hd.service;

import com.example.hd.mapper.Usermapper;
import com.example.hd.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    Usermapper usermapper;
    public List<user> list() {
        return usermapper.findAll();
    }

    public user getById(Integer id) {
        return usermapper.findById(id);
    }

    public boolean save(user user) {
        try {
            usermapper.insert(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateById(user user) {
        try {
            usermapper.update(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeById(Integer id) {
        try {
            usermapper.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }}
