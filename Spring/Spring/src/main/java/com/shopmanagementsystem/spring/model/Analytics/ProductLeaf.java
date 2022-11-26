package com.shopmanagementsystem.spring.model.Analytics;

public class ProductLeaf implements Component{
    double price;
    int quantity;
    String name;

    public ProductLeaf(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    @Override
    public String showInfo() {
        return "\nProduct name: " + name + "\nProduct Price: " + price +
                "\nProduct Quantity: " + quantity + "\n\n";
    }
}
