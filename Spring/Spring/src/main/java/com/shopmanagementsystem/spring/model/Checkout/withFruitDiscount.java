package com.shopmanagementsystem.spring.model.Checkout;

import com.shopmanagementsystem.spring.Entity.DiscountedProduct;
import com.shopmanagementsystem.spring.Entity.Receipt;

import java.util.ArrayList;
import java.util.List;

public class withFruitDiscount extends CheckoutDecorator{
    List<DiscountedProduct> discountedProducts;

    public withFruitDiscount(Checkout checkout){
        super(checkout);
    }


    @Override
    public Receipt getReceipt() {
        getDiscounts();
        Receipt newReceipt = checkout.getReceipt();


        //Apply discounts where and if nesscary
        for(DiscountedProduct d : discountedProducts){
            String newDescription = d.getName() + " --- FRUIT discount of --- " + d.getDiscountAvailable() + "%";
            double newPrice = newReceipt.getPrice(d.getName()) * (100 - d.getDiscountAvailable())/100;
            double roundedNewPrice = Math.round(newPrice);
            newReceipt.updateElement(d.getName(),newDescription, roundedNewPrice);
        }
        return newReceipt;
    }


    //Get all active fruit discounts the user has
    private void getDiscounts(){
        //Coming from the db activeMeatDiscounts table

        //-----------------Example-------------------------------------
        List<DiscountedProduct> discounts = new ArrayList<>();
        DiscountedProduct d = new DiscountedProduct("apple",15);
        DiscountedProduct d1 = new DiscountedProduct("orange",20);
        discounts.add(d);
        discounts.add(d1);
        //--------------------------------------------------------------
        this.discountedProducts = discounts;
    }
}
