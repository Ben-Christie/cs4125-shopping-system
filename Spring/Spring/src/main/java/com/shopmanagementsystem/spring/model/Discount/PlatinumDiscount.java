package com.shopmnagementsystem.spring.model.Discount;

public class PlatinumDiscount implements IDiscountState {
    User user;

    public PlatinumDiscount(User newUser) {
        user = newUser;
    }

    @Override
    public int[] getDiscountRange() {
        int[] range = new int[2];

        // 16 - 20%
        int min = 16;
        int max = 20;

        range[0] = min;
        range[1] = max;

        return range;
    }

    @Override
    public DiscountedProducts[] generateDiscountedProductList(int size, int[] discountRange) {

    }

}