package com.shopmanagementsystem.spring.model.Discount;

public interface IDiscountState {
    int[] getDiscountRange();

    void generateDiscountedProductsList(int size, int[] discountRange);

    int generateDiscountValue(int min, int max);

    int[] getDiscountIndexes(int numValues, int size);

    boolean indexSelected(int index, int[] indexes);
}