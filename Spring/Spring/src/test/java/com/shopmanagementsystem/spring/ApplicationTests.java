package com.shopmanagementsystem.spring;

import com.shopmanagementsystem.spring.Database.DAO.DiscountedProductsDAO;
import com.shopmanagementsystem.spring.Database.DAO.ProductDAO;
import com.shopmanagementsystem.spring.Database.DBEntity.DiscountedProduct;
import com.shopmanagementsystem.spring.Database.DBEntity.Product;
import com.shopmanagementsystem.spring.Database.DBEntity.User;
import com.shopmanagementsystem.spring.Database.Repo.DiscountedProductRepo;
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
	private ProductDAO productDAO;

	@Autowired
	private DiscountedProductsDAO discountedProductsDAO;

	@Test
	void addUser() {
		User user = new User();
		user.setName("jeff@gmail.com");
		user.setPassword("max123");
		userDAO.save(user);
	}

	@Test
	void getAllUsers() {
		List<User> users = userDAO.getAllUsers();
		System.out.println(users);
	}

	@Test
	void getAllProducts() {
		List<Product> products = productDAO.getAllProducts();
		System.out.println(products);
	}

	@Test
	void addDiscountedProduct() {
		DiscountedProduct discountedProduct = new DiscountedProduct("Bread", 4);
		discountedProductsDAO.save(discountedProduct);
	}

	@Test
	void getAllDiscountedProducts() {
		List<DiscountedProduct> products = discountedProductsDAO.getAllDiscountedProducts();
		System.out.println(products);
	}
}
