package com.shopmanagementsystem.spring.Database.Repo;

import com.shopmanagementsystem.spring.Database.DBEntity.Cart;
import com.shopmanagementsystem.spring.Database.DBEntity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepo extends CrudRepository<Cart,Integer> {
}
