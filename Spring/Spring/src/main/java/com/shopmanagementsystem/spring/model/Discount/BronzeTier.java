package com.shopmanagementsystem.spring.model.Discount;

import java.util.List;

import com.shopmanagementsystem.spring.Database.DAO.ProductDAO;
import com.shopmanagementsystem.spring.Entity.DiscountedProduct;
import com.shopmanagementsystem.spring.Entity.Product;
import com.shopmanagementsystem.spring.Database.DAO.DiscountedProductsDAO;

public class BronzeTier implements IDiscountState {
    ProductDAO productDAO;
    DiscountedProductsDAO discountedProductsDAO;

    Discount discount;

    public BronzeTier(Discount discount) {
        this.discount = discount;
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
    public void generateDiscountedProductsList(int size, int[] discountRange) {
        List<Product> products = productDAO.getAllProducts();

        int[] indexes = getDiscountIndexes(products.size(), size);

        for (int i = 0; i < products.size(); i++) {
            if (indexSelected(i, indexes)) {
                Product product = products.get(i);

                DiscountedProduct discountedProduct = new DiscountedProduct(product.getName(),
                        generateDiscountValue(discountRange[0], discountRange[1]));

                discountedProductsDAO.save(discountedProduct);
            }
        }

    }

    @Override
    public int generateDiscountValue(int min, int max) {
        int discount = (int) (Math.random() * (max - min) + min);

        return discount;
    }

    @Override
    public int[] getDiscountIndexes(int numValues, int size) {
        int[] indexes = new int[size];

        for (int i = 0; i < size; i++) {
            int index;
            do {
                index = (int) (Math.random() * ((numValues - 1) - 0) + 0);
            } while (indexSelected(index, indexes));

            indexes[i] = index;
        }
        return indexes;
    }

    @Override
    public boolean indexSelected(int index, int[] indexes) {
        for (int i : indexes) {
            if (i == index) {
                return true;
            }
        }
        return false;
    }
}