package com.shopmanagementsystem.spring.model.LoginSignUp;

public class SignUp {

    private boolean checkEmailAvailable(String email){
        //check if email is available in the db
        return true;
    }

    public boolean createUser(String email, String password){
        if(checkEmailAvailable(email)){
            return true;
        }
        //add use to the db
        return true;
    }
}
