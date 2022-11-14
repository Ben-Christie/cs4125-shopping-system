package com.shopmanagementsystem.spring.Database.Repo;

import com.shopmanagementsystem.spring.Database.DBEntity.DiscountedProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountedProductRepo extends CrudRepository<DiscountedProduct, Integer> {
}