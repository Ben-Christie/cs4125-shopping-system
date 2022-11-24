package com.shopmanagementsystem.spring.model.Checkout;

import com.shopmanagementsystem.spring.Database.DAO.CartDAO;
import com.shopmanagementsystem.spring.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public abstract class Checkout {

    List<Product> cart;
    public void loadCart(List<Product> cart){
        this.cart = cart;
    }
    public abstract Receipt getReceipt();
}
