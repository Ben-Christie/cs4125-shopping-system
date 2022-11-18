package com.shopmanagementsystem.spring.model.Discount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopmanagementsystem.spring.Database.DAO.DiscountedProductsDAO;
import com.shopmanagementsystem.spring.Database.DBModel.DiscountedProduct;

// Discount service class
@Service
public class DiscountService {
  @Autowired
  DiscountedProductsDAO discountedProductsDAO;

  public List<DiscountedProduct> getDiscountedProducts() {
    return discountedProductsDAO.getAllDiscountedProducts();
  }
}
