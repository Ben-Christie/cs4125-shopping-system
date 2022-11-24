package com.shopmanagementsystem.spring.Controllers.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopmanagementsystem.spring.DTO.DiscountedProductDTO;
import com.shopmanagementsystem.spring.Entity.DiscountedProduct;
import com.shopmanagementsystem.spring.Mappers.DiscountedProductMapper;
import com.shopmanagementsystem.spring.model.Discount.DiscountService;

@RestController
public class DiscountController {
  // access service class
  @Autowired
  DiscountService discountService;

  @Autowired
  DiscountedProductMapper discountedProductMapper;

  // get discounts from db
  @GetMapping("/discounted-product/get-all")
  public List<DiscountedProduct> getAllDiscountedProducts() {
    return discountService.getDiscountedProducts();
  }

  @PostMapping("/discounted-product/activate-discount")
  public void activateDiscount(@RequestBody DiscountedProductDTO discountedProductDTO) {
    // Convert DTO -> Entity
    DiscountedProduct discountedProduct = discountedProductMapper.DTOToEntity(discountedProductDTO);
    // activate the discount
    discountService.activateDiscount(discountedProduct);
  }
}
