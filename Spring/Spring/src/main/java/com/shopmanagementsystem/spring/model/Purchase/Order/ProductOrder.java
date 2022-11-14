package com.shopmanagementsystem.spring.model.Purchase.Order;

import com.shopmanagementsystem.spring.Database.DBEntity.Product;

public class ProductOrder {

    public void addToCart(Product p){
        System.out.println("adding " + p.getName() + " to cart");
    }

    public void checkOut(){
        System.out.println("Checking out all products");
        //Convert cart into PurchaseInformation -> call subject PurchaseSubject
    }


}
