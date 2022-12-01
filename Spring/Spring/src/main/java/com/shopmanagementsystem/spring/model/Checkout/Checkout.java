package com.shopmanagementsystem.spring.model.Checkout;

import com.shopmanagementsystem.spring.Entity.Product;
import com.shopmanagementsystem.spring.Entity.Receipt;

import java.util.List;


public abstract class Checkout {

    List<Product> cart;
    public void loadCart(List<Product> cart){
        this.cart = cart;
    }
    public abstract Receipt getReceipt();
}
