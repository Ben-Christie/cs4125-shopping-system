package com.shopmanagementsystem.spring.model.Checkout;

import com.shopmanagementsystem.spring.Entity.Product;

public class CheckoutOrder extends Checkout{

    @Override
    public Receipt getReceipt() {
        //Add each element from the cart to the receipt
        Receipt receipt = new Receipt();
        for(Product p : cart){
            receipt.addElement(p);
        }
        return receipt;
    }
}
