package com.shopmanagementsystem.spring.model.Checkout;

import com.shopmanagementsystem.spring.Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    List<Product> products;

    public Receipt() {
        products = new ArrayList<>();
    }


    public void addElement(Product p){
        products.add(p);
    }

    public void updateElement(String oldDescription, String newDescription, double newPrice){
        for(Product p : products){
            if(p.getName().equalsIgnoreCase(oldDescription)){
                p.setName(newDescription);
                p.setPrice(newPrice);
            }
        }
    }

    public double getPrice(String description){
        for(Product p : products){
            if(p.getName().equalsIgnoreCase(description)){
                return p.getPrice();
            }
        }return 0;
    }

    public double totalPrice(){
        double total = 0;
        for(Product p : products){
            total += p.getPrice();
        }
        return total;
    }

    public String formatedReceipt(){
        String receipt = "";

        for(Product p : products){
            receipt += "Item: "+ p.getName() + "------ Price: " + p.getPrice() + "\n";
        }
        return receipt;
    }


}
