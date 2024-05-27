package homework09.server.model;

import lombok.Data;

import java.util.List;

@Data
public class UsersModel {
    public Integer id;
    public String username;
    public String password;
    public String address;

}
