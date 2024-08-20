package org.scpu.homework02.service;

import org.scpu.homework02.dao.UserMapper;
import org.scpu.homework02.entity.User;
import org.scpu.homework02.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserServiceImpl {
    @Autowired
    UserMapper mapper;

    @Override
    public List<User> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public User selectByUsername(String username) {
        return mapper.selectByUsername(username);
    }

    @Override
    public void insert(String username, String password) {
        mapper.insert(new User(username, password));
    }

    @Override
    public void update(String username, String password) {
        mapper.update(new User(username, password));
    }

    @Override
    public void delete(String username) {
        mapper.delete(username);
    }
}
