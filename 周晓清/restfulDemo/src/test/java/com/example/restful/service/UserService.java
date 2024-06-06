package com.example.restful.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.restful.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
public interface UserService extends IService<User> {

    List<User> List();


    User getById(Integer id);

    boolean save(User user);

    boolean updateById(User user);

    boolean removeById(Integer id);
}
