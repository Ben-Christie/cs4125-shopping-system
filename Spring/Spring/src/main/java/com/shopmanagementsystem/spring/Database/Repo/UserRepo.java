package com.shopmanagementsystem.spring.Database.Repo;


import com.shopmanagementsystem.spring.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository                     //What the repo is for, primary key type
public interface UserRepo extends CrudRepository<User,Integer> {
}
