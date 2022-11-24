package com.shopmanagementsystem.spring.Database.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopmanagementsystem.spring.Entity.DiscountedProduct;

@Repository
public interface ActiveDiscountRepo extends CrudRepository<DiscountedProduct, Integer> {

}
