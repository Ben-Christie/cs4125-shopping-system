package com.shopmanagementsystem.spring.Database.Repo;

import com.shopmanagementsystem.spring.Database.DBModel.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {
}
