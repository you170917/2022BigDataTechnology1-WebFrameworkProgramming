/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.springboot.demos.web;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Controller
public class BasicController {

    // http://127.0.0.1:8080/hello?name=lisi
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam(name = "name", defaultValue = "unknown user") String name) {
        return "Hello " + name;
    }

    // http://127.0.0.1:8080/user
    @RequestMapping("/user")
    @ResponseBody
    public User user() {
        User user = new User() {
            @Override
            public boolean equals(Object another) {
                return false;
            }

            @Override
            public String toString() {
                return null;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getFullName() {
                return null;
            }

            @Override
            public void setFullName(String s) {

            }

            @Override
            public Iterator<Group> getGroups() {
                return null;
            }

            @Override
            public String getPassword() {
                return null;
            }

            @Override
            public void setPassword(String s) {

            }

            @Override
            public Iterator<Role> getRoles() {
                return null;
            }

            @Override
            public UserDatabase getUserDatabase() {
                return null;
            }

            @Override
            public String getUsername() {
                return null;
            }

            @Override
            public void setUsername(String s) {

            }

            @Override
            public void addGroup(Group group) {

            }

            @Override
            public void addRole(Role role) {

            }

            @Override
            public boolean isInGroup(Group group) {
                return false;
            }

            @Override
            public boolean isInRole(Role role) {
                return false;
            }

            @Override
            public void removeGroup(Group group) {

            }

            @Override
            public void removeGroups() {

            }

            @Override
            public void removeRole(Role role) {

            }

            @Override
            public void removeRoles() {

            }
        };
        user.getName();
        user.getName();
        return user;
    }

    // http://127.0.0.1:8080/save_user?name=newName&age=11
    @RequestMapping("/save_user")
    @ResponseBody
    public String saveUser(User u) {
        return "user will save: name=" + u.getName() + ", age=" + u.getAge();
    }

    // http://127.0.0.1:8080/html
    @RequestMapping("/html")
    public String html() {
        return "index.html";
    }

    @ModelAttribute
    public void parseUser(@RequestParam(name = "name", defaultValue = "unknown user") String name
            , @RequestParam(name = "age", defaultValue = "12") Integer age, User user) {
        user.setName("zhangsan");
        user.setAge(18);
    }
}
