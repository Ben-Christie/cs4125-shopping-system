package com.shopmanagementsystem.spring;

import com.shopmanagementsystem.spring.Database.DBEntity.User;
import com.shopmanagementsystem.spring.Database.DAO.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private DiscountedProductsDAO discountedProductsDAO;

	@Test
	void addUser() {
		User user = new User();
		user.setName("max@gmail.com");
		user.setPassword("max123");
		userDAO.save(user);
	}

	@Test
	void getAllEmployees(){
		List<User> users = userDAO.getAllUsers();
		System.out.println(users);
	}

	@Test
	void addDiscountedProduct() {
		DiscountedProduct discountedProduct = new DiscountedProduct();
		discountedProduct.setName("Bread");
		discountedProduct.setDiscountAvailable(4);
		discountedProductsDAO.save(discountedProduct);
	}

	@Test
	void getAllDiscountedProducts() {
		List<DiscountedProduct> discountedProductList = discountedProductsDAO.getAllDiscountedProducts();
		System.out.println(discountedProductList);
	}



}
