package com.shopmanagementsystem.spring.Controllers.Rest;

import com.shopmanagementsystem.spring.Database.DAO.UserDAO;
import com.shopmanagementsystem.spring.Database.DBEntity.User;
import com.shopmanagementsystem.spring.model.User.Login;
import com.shopmanagementsystem.spring.model.User.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private SignUp signUp;

    @Autowired
    private Login login;

//    @GetMapping("/Database/get-all")
//    public List<User> getAllUsers(){
//        return userDAO.getAllUsers();
//    }

    /*
    User signs up for the app, they are added to the db
     */
    @PostMapping("/User/CreateUser")
    public boolean createUser(@RequestBody User user){
        return signUp.createUser(user);
    }

    /*
    User attempts a login, their cred are verified against what is in the db
     */
    @PostMapping("/User/VerifyCreds")
    public boolean verifyCreds(@RequestBody User user){
        return login.verifyCreds(user);
    }
}
