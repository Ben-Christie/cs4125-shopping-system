package com.shopmanagementsystem.spring.Controllers.Rest;

import com.shopmanagementsystem.spring.Converter.UserConverter;
import com.shopmanagementsystem.spring.DTO.UserDTO;
import com.shopmanagementsystem.spring.Entity.User;
import com.shopmanagementsystem.spring.model.User.Login;
import com.shopmanagementsystem.spring.model.User.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //Wire in our service classes
    @Autowired
    private SignUp signUp;
    @Autowired
    private Login login;
    @Autowired
    private UserConverter userConverter;

    /*
    User signs up for the app, they are added to the db
     */
    @PostMapping("/User/CreateUser")
    public boolean createUser(@RequestBody UserDTO userDTO){
        //Convert UserDTO -> Entity
        User user = userConverter.dtoToEntity(userDTO);
        return signUp.createUser(user);
    }

    /*
    User attempts a login, their cred are verified against what is in the db
     */
    @PostMapping("/User/VerifyCreds")
    public boolean verifyCreds(@RequestBody UserDTO userDTO){
        User user = userConverter.dtoToEntity(userDTO);
        return login.verifyCreds(user);
    }
}
