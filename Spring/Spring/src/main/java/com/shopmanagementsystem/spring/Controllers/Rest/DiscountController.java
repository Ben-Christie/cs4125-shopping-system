package com.shopmanagementsystem.spring.Controllers.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopmanagementsystem.spring.Database.DAO.DiscountedProductsDAO;
import com.shopmanagementsystem.spring.Database.DBModel.DiscountedProduct;
import com.shopmanagementsystem.spring.model.Discount.DiscountService;

@RestController
public class DiscountController {
  // access service class
  @Autowired
  DiscountService discountService;

  // get discounts from db
  @GetMapping("/discounted-product/get-all")
  public List<DiscountedProduct> getAllDiscountedProducts() {
    return discountService.getDiscountedProducts();
  }
}
