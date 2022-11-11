package com.shopmanagementsystem.spring;

import com.shopmanagementsystem.spring.model.Database.User;
import com.shopmanagementsystem.spring.model.Database.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private UserDAO userDAO;

	@Test
	void addUser() {
		User user = new User();
		user.setName("max@gmail.com");
		user.setPassword("max123");
		userDAO.save(user);
	}

	//@Test
	void getAllEmployees(){
		List<User> users = userDAO.getAllUsers();
		System.out.println(users);
	}



}
