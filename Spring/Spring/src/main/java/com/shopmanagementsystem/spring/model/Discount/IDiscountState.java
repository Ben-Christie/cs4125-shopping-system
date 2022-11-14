package com.shopmnagementsystem.spring.model.Discount;

public interface IDiscountState {
    int[] getDiscountRange();

    DiscountedProduct[] generateDiscountedProductsList(int size, int[] discountRange);
}