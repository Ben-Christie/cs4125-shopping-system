package com.shopmanagementsystem.spring.model.Checkout;

import com.shopmanagementsystem.spring.Entity.DiscountedProduct;

import java.util.ArrayList;
import java.util.List;

public class withDiscount extends CheckoutDecorator{

    List<DiscountedProduct> discountedProducts;
    Checkout checkout;

    public withDiscount(Checkout checkout){
        this.checkout = checkout;
    }


    @Override
    public Receipt getReceipt() {
        getDiscounts();
        Receipt newReceipt = checkout.getReceipt();


        //Apply discounts where and if nesscary
        for(DiscountedProduct d : discountedProducts){
            String newDescription = d.getName() + " discount of " + d.getDiscountAvailable() + "%";
            double newPrice = newReceipt.getPrice(d.getName()) * (100 - d.getDiscountAvailable())/100;
            double roundedNewPrice = Math.round(newPrice);
            newReceipt.updateElement(d.getName(),newDescription, roundedNewPrice);
        }
        return newReceipt;
    }


    //Get all the users active discounts
    private void getDiscounts(){
        //Comming from the db
        //Need update when active discount is implemented
        List<DiscountedProduct> discounts = new ArrayList<>();
        DiscountedProduct d = new DiscountedProduct("bread",12);



        DiscountedProduct d1 = new DiscountedProduct("grapes",5);


        ///////////////////////////////////////////////////////////////////////////////////----


        discounts.add(d);
        discounts.add(d1);


        this.discountedProducts = discounts;
    }
}
