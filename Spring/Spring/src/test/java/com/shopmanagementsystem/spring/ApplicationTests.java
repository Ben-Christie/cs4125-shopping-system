package com.shopmanagementsystem.spring;

import com.shopmanagementsystem.spring.Controllers.Rest.UserController;
import com.shopmanagementsystem.spring.Database.DAO.CartDAO;
import com.shopmanagementsystem.spring.Database.DAO.DiscountedProductsDAO;
import com.shopmanagementsystem.spring.Database.DAO.ProductDAO;
import com.shopmanagementsystem.spring.Entity.DiscountedProduct;
import com.shopmanagementsystem.spring.Entity.Product;
import com.shopmanagementsystem.spring.Database.DAO.UserDAO;
import com.shopmanagementsystem.spring.Entity.User;
import com.shopmanagementsystem.spring.model.Purchase.Analytics.Analytics;
import com.shopmanagementsystem.spring.model.Points.AddPoints.AddPoints;
import com.shopmanagementsystem.spring.model.Purchase.PurchaseSubject;
import com.shopmanagementsystem.spring.model.User.SignUp;
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
	private UserController userController;

	@Test
	void testUserServices(){
		//Create a new user
		int random = (int)(Math.random()*1e5);
		String email = "newuser" + random + "@gmail.com";
		User newUser = new User();
		newUser.setName(email);
		newUser.setPassword("password");

		SignUp signUp = new SignUp();
		boolean userCreated = signUp.createUser(newUser);
	}


	void testUser(){
		//Create a new user
		int random = (int)(Math.random()*1e5);
		String email = "newuser" + random + "@gmail.com";
		User newUser = new User();
		newUser.setName(email);
		newUser.setPassword("password");
		userDAO.save(newUser);



	}

	@Test
	void verifyUser(){

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
	void testComposite(){
		 PurchaseSubject ps = new PurchaseSubject();
		 Analytics analytics = new Analytics(ps);

		 ps.notifyAllObservers();
		System.out.println(analytics.allProducts());
		System.out.println(analytics.fruitAndVeg());
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
