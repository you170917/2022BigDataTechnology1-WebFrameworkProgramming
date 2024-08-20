package org.scpu.homework02.service.impl;

import org.scpu.homework02.entity.User;

import java.util.List;

public interface UserServiceImpl {
    public List<User> selectAll();
    public User selectByUsername(String username);
    public void insert(String username,String password);
    public void update(String username,String password);
    public void delete(String username);
}
