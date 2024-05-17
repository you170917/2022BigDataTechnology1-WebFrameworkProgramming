package com.example.restful.model;

import lombok.Data;
import lombok.var;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.example.restful.model.Role;
@Data
public class Account implements UserDetails {
    private Integer id;
    private String username;
    private String password;
    private Boolean enabled;
    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
            ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();
            for (var role : roles) {
                authorities.add(new SimpleGrantedAuthority("ROLE_" +
                        role.getRoleName()));
            }

            return authorities;
        }

        @Override
        public boolean isAccountNonExpired () {
            return true;
        }

        @Override
        public boolean isAccountNonLocked () {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired () {
            return true;
        }

        @Override
        public boolean isEnabled () {
            return enabled;
        }


}
