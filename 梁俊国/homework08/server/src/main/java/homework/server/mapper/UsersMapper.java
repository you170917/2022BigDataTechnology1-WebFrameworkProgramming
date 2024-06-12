package homework.server.mapper;

import homework.server.model.UsersModel;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UsersMapper {
    @Select("SELECT * FROM users")
    List<UsersModel> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    UsersModel findById(Integer id);

    @Insert("INSERT INTO users (username, address) VALUES (#{username}, #{address})")
    void insert(UsersModel user);

    @Update("UPDATE users SET username = #{username}, address = #{address} WHERE id = #{id}")
    void update(UsersModel user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteById(Integer id);
}
