package com.shopmanagementsystem.spring.model.Purchase.Order;

import com.shopmanagementsystem.spring.Database.DAO.CartDAO;
import com.shopmanagementsystem.spring.Database.DBModel.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductOrder {

    @Autowired
    CartDAO cartDAO;


    public void addToCart(Product p){
        cartDAO.addProduct(p);
    }

    public void clearCart(){
        cartDAO.clearCart();
    }

    public List<Product> checkOut(){

        //Possibly put logic for applying discount here
        return cartDAO.getCart();
    }


}
