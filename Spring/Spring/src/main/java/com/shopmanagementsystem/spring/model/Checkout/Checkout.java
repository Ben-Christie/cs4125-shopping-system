package com.shopmanagementsystem.spring.model.Checkout;

import com.shopmanagementsystem.spring.Database.DAO.CartDAO;
import com.shopmanagementsystem.spring.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class Checkout {
    @Autowired
    CartDAO cartDAO;
    List<Product> cart;
    protected void getCart(){
        cart = cartDAO.getCart();
    }
    public abstract Receipt getReceipt();
}
