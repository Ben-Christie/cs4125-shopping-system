package com.shopmanagementsystem.spring;

import com.shopmanagementsystem.spring.Database.DAO.CartDAO;
import com.shopmanagementsystem.spring.Database.DAO.DiscountedProductsDAO;
import com.shopmanagementsystem.spring.Database.DAO.ProductDAO;
import com.shopmanagementsystem.spring.Entity.DiscountedProduct;
import com.shopmanagementsystem.spring.Entity.Product;
import com.shopmanagementsystem.spring.Database.DAO.UserDAO;
import com.shopmanagementsystem.spring.Entity.User;
import com.shopmanagementsystem.spring.model.Checkout.Checkout;
import com.shopmanagementsystem.spring.model.Checkout.CheckoutOrder;
import com.shopmanagementsystem.spring.model.Points.AddPoints.AddPoints;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private DiscountedProductsDAO discountedProductsDAO;

	@Autowired
	private Checkout checkout;

	// @Test
	// void addUser() {
	// User user = new User();
	// user.setName("jeff@gmail.com");
	// user.setPassword("max123");
	// userDAO.save(user);
	// }

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

	@Test
	void checkPointCalculator() {
		List<Product> products = new ArrayList<>();
		Product eggs = new Product();
		eggs.setName("eggs");
		eggs.setPrice(2.50);

		Product bread = new Product();
		bread.setName("bread");
		bread.setPrice(3.50);

		Product salad = new Product();
		salad.setName("salad");
		salad.setPrice(1.30);

		products.add(eggs);
		products.add(bread);
		products.add(salad);

		AddPoints addPoints = new AddPoints();
		addPoints.addPoints(products);

	}



	@Autowired
	private CartDAO cartDAO;
	@Test
	void checkOutDecoratorCheck(){
		System.out.println(cartDAO.getCart());

	}
}
