package com.shopmanagementsystem.spring.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.shopmanagementsystem.spring.Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ReceiptDTO {
    @JsonProperty("ReceiptDTO")
    List<Product> purchases = new ArrayList<>();


    public List<Product> getReceiptContent() {
        return purchases;
    }

    public void setReceiptContent(List<Product> purchases) {
        this.purchases = purchases;
    }

    public List<Product> getPurchases() {
        return purchases;
    }
}
