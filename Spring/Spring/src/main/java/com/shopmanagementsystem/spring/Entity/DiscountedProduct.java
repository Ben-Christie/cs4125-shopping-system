package com.shopmanagementsystem.spring.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DiscountedProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int discountAvailable;
    boolean isActive;

    public DiscountedProduct(String name, int discountAvailable) {
        this.name = name;
        this.discountAvailable = discountAvailable;
        this.isActive = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscountAvailable() {
        return discountAvailable;
    }

    public void setDiscountAvailable(int discountAvailable) {
        this.discountAvailable = discountAvailable;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "DiscountedProduct{" +
                "id=" + id +
                ", name=" + name +
                ", discount available=" + discountAvailable +
                "}";
    }
}