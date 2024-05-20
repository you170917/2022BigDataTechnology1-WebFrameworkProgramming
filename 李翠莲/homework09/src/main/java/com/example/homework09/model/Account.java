package com.example.homework09.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account implements UserDetails {
    private Integer id;
    private String username;
    private String password;
    private Boolean enabled;
    private List<Role> roles; //一个用户可能有多个角色
    /**
     * 返回用户的所有角色
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" +
                    role.getRoleName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    /**
     * 账户是否未过期
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    /**
     * 账户是否未锁定
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 密码是否未过期
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    /**
     * 账户是否可用
     * @return
     */
    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setRoles(List<com.example.homework09.model.Role> accountRoleById) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(Object password) {
        this.password = (String) password;
    }
}