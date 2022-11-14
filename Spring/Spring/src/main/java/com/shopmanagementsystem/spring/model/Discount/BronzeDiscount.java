package com.shopmnagementsystem.spring.model.Discount;

public class BronzeDiscount implements IDiscountState {
    User user;

    public BronzeDiscount(User newUser) {
        user = newUser;
    }


}