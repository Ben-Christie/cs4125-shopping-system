package com.shopmanagementsystem.spring.model.Discount;

import com.shopmanagementsystem.spring.Database.DBEntity.DiscountedProduct;

public class GoldDiscount implements IDiscountState {
    User user;

    public GoldDiscount(User newUser) {
        user = newUser;
    }

    @Override
    public int[] getDiscountRange() {
        int[] range = new int[2];

        // 11 - 15%
        int min = 11;
        int max = 15;

        range[0] = min;
        range[1] = max;

        return range;
    }

    @Override
    public DiscountedProducts[] generateDiscountedProductList(int size, int[] discountRange) {

    }

}