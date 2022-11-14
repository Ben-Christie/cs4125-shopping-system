package com.shopmanagementsystem.spring.model.Discount;

import com.shopmanagementsystem.spring.Database.DBEntity.DiscountedProduct;

public class BronzeDiscount implements IDiscountState {
    User user;

    public BronzeDiscount(User newUser) {
        user = newUser;
    }

    @Override
    public int[] getDiscountRange() {
        int[] range = new int[2];

        // 1 - 5%
        int min = 1;
        int max = 5;

        range[0] = min;
        range[1] = max;

        return range;
    }

    @Override
    public DiscountedProducts[] generateDiscountedProductList(int size, int[] discountRange) {

    }

}