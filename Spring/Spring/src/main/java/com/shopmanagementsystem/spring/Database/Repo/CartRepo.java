package com.shopmanagementsystem.spring.Database.Repo;

import com.shopmanagementsystem.spring.Database.DBModel.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepo extends CrudRepository<Cart,Integer> {
}
