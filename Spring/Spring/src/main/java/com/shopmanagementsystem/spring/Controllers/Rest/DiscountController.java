package com.shopmanagementsystem.spring.Controllers.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopmanagementsystem.spring.Database.DAO.DiscountedProductsDAO;
import com.shopmanagementsystem.spring.Database.DBEntity.DiscountedProduct;

@RestController
public class DiscountController {
  // access DAO
  @Autowired
  private DiscountedProductsDAO discountedProductsDAO;

  // get discounts from db
  @GetMapping("/discounted-product/get-all")
  public List<DiscountedProduct> getAllDiscountedProducts() {
    return discountedProductsDAO.getAllDiscountedProducts();
  }
}
