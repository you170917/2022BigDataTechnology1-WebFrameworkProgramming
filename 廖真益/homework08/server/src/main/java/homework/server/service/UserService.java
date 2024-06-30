package homework.server.service;

import homework.server.mapper.UsersMapper;
import homework.server.model.UsersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UsersMapper usersMapper;
    public List<UsersModel> list() {
        return usersMapper.findAll();
    }

    public UsersModel getById(Integer id) {
        return usersMapper.findById(id);
    }

    public boolean save(UsersModel user) {
        try {
            usersMapper.insert(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateById(UsersModel user) {
        try {
            usersMapper.update(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeById(Integer id) {
        try {
            usersMapper.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
