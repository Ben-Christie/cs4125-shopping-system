package com.shopmanagementsystem.spring.Database.DAO;

import com.shopmanagementsystem.spring.Database.DBEntity.User;
import com.shopmanagementsystem.spring.Database.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDAO {

    @Autowired
    private UserRepo userRepo;


    public void save(User user){
        userRepo.save(user);
    }

    public void delete(User user){
        userRepo.delete(user);
    }





    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        Streamable.of(userRepo.findAll())
                .forEach(user -> {
                    users.add(user);
                });
        return users;
    }





}
