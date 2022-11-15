package com.shopmanagementsystem.spring.model.User;


import com.shopmanagementsystem.spring.Database.DAO.UserDAO;
import com.shopmanagementsystem.spring.Database.DBEntity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SignUp {


    @Autowired
    UserDAO userDAO = new UserDAO();


    private boolean checkEmailAvailable(String email){
        List<User> users = userDAO.getAllUsers();

        for (User user : users){
            if(email.equalsIgnoreCase(user.getName())){
                //The email is taken
                return false;
            }
        }
        return true;
    }

    public boolean createUser(User user){
        if(checkEmailAvailable(user.getName())){
            userDAO.save(user);
            return true;
        }
        return false;
    }
}
