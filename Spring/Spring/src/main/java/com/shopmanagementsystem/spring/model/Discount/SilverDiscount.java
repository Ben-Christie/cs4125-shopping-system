package com.shopmanagementsystem.spring.model.Discount;

import com.shopmanagementsystem.spring.Database.DBEntity.DiscountedProduct;

public class SilverDiscount implements IDiscountState {
    User user;

    public SilverDiscount(User newUser) {
        user = newUser;
    }

    @Override
    public int[] getDiscountRange() {
        int[] range = new int[2];

        // 6 - 10%
        int min = 6;
        int max = 10;

        range[0] = min;
        range[1] = max;

        return range;
    }

    @Override
    public DiscountedProducts[] generateDiscountedProductList(int size, int[] discountRange) {

    }

}