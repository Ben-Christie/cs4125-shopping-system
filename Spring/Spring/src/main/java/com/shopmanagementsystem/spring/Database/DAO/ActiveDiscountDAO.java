package com.shopmanagementsystem.spring.Database.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import com.shopmanagementsystem.spring.Database.Repo.ActiveDiscountRepo;
import com.shopmanagementsystem.spring.Entity.DiscountedProduct;

@Service
public class ActiveDiscountDAO {
  @Autowired
  private ActiveDiscountRepo repository;

  public void save(DiscountedProduct discountedProduct) {
    repository.save(discountedProduct);
  }

  public void delete(DiscountedProduct discountedProduct) {
    repository.delete(discountedProduct);
  }

  public List<DiscountedProduct> getAllDiscountedProducts() {
    List<DiscountedProduct> discountedProductList = new ArrayList<>();

    Streamable.of(repository.findAll())
        .forEach(product -> {
          discountedProductList.add(product);
        });

    return discountedProductList;
  }
}
