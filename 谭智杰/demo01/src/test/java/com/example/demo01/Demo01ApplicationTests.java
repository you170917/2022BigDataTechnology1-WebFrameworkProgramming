package com.example.demo01;

import com.example.bean.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.mapper.userMapper;

import java.util.List;

@SpringBootTest
class Demo01ApplicationTests {
	@Autowired
	userMapper userMapper;

	@Autowired
	userMapper userMapper1;

	@Test
	void contextLoads() {
		List<Users> allUsers = userMapper.getAllUsers();
		System.out.println(allUsers);
	}

	@Test
	void test1(){
		Users user = userMapper.getUsername("zhangsan");
		System.out.println(user);
	}
	@Test
	void test2(){
		Users users = new Users();
		users.setName("hello");
		users.setWord("123456");
		users.setAge(22);
		userMapper.addUser(users);
	}
	@Test
	void test3(){
		Users users = new Users();
		users.setName("lisi");
		users.setWord("22222");
		userMapper.updateUser(users);
	}
	@Test
	void test4(){
		userMapper.deleteUser("wangwu");
	}


	@Test
	void text5() {
		List<Users> allUsers = userMapper1.getAllUsers();
		System.out.println(allUsers);
	}
	@Test
	void test6(){
		Users user = userMapper1.getUsername("zhangsan");
		System.out.println(user);
	}
	@Test
	void test7(){
		Users users = new Users();
		users.setName("hello");
		users.setWord("123456");
		users.setAge(22);
		userMapper1.addUser(users);
	}
	@Test
	void test8(){
		Users users = new Users();
		users.setName("lisi");
		users.setWord("22222");
		userMapper1.updateUser(users);
	}
	@Test
	void test9(){
		userMapper1.deleteUser("zhangsan");
	}

}
