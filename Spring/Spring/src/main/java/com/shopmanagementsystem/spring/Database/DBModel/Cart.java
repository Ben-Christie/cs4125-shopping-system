package com.shopmanagementsystem.spring.Database.DBModel;


import com.shopmanagementsystem.spring.Entity.Product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    double price;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product toProduct(){
        Product p = new Product();
        p.setName(this.name);
        p.setPrice(this.price);
        return p;
    }
}
