package com.shopmanagementsystem.spring.model.Discount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shopmanagementsystem.spring.Database.DAO.DiscountedProductsDAO;
import com.shopmanagementsystem.spring.Entity.DiscountedProduct;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {
  @Autowired
  DiscountedProductsDAO discountedProductsDAO;

  public List<DiscountedProduct> getDiscountedProducts() {
    return discountedProductsDAO.getAllDiscountedProducts();
  }

  public void activateDiscount(DiscountedProduct discountedProduct) {
    discountedProductsDAO.activateDiscount(discountedProduct);
  }
}
