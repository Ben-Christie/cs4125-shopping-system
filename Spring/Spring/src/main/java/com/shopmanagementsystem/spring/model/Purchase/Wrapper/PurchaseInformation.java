package com.shopmanagementsystem.spring.model.Purchase.Wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shopmanagementsystem.spring.Database.DBEntity.Product;

import java.util.ArrayList;
import java.util.List;

/*
Wrapper class for products
 */
public class PurchaseInformation {
    @JsonProperty("PurchaseInfo")
    List<Product> purchases = new ArrayList<>();

    public List<Product> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Product> purchases) {
        this.purchases = purchases;
    }

    public void printInformation(){
        if (purchases.size() == 0){
            System.out.println("Empty");
        }
        for(Product p : purchases){
            System.out.println(purchases.toString());
        }
    }

}
