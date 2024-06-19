package homework.server.model;

import lombok.Data;

@Data
public class UsersModel {
    public Integer id;
    public String username;
    public String password;
    public String address;
}
