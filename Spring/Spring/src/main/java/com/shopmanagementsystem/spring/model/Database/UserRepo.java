package com.shopmanagementsystem.spring.model.Database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository                     //What the repo is for, primary key type
public interface UserRepo extends CrudRepository<User,Integer> {
}
