package com.example.homework05.model;

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
@Override
 public Collection<? extends GrantedAuthority> getAuthorities() {
 ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();
 for (Role role : roles) {
 authorities.add(new SimpleGrantedAuthority("ROLE_" +
                    role.getClass()));
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

 @Override
public boolean isAccountNonExpired() {
 return true;
  }
  @Override
public boolean isAccountNonLocked() {
 return true;
  }
@Override
 public boolean isCredentialsNonExpired() {
 return true;
 }
@Override
 public boolean isEnabled() {
 return enabled;
  }

 public void setPassword(Object o) {
 }
}
