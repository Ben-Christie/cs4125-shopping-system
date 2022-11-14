package com.shopmanagementsystem.spring.model.Discount;

import com.shopmanagementsystem.spring.Database.DBEntity.DiscountedProduct;

public interface IDiscountState {
    int[] getDiscountRange();

    DiscountedProduct[] generateDiscountedProductsList(int size, int[] discountRange);
}