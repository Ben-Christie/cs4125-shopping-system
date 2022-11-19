package UIControls;


import android.content.Context;

import java.io.IOException;

import Model.User.UserService;

public class LoginController {
    UserService userService;

    public LoginController(Context context){
        userService = new UserService();
    }

    public boolean verify(String email, String password){

            return userService.verifyCreds(email,password);

    }

    public boolean createAccount(String email, String password){
        return userService.createAccount(email,password);
    }


}
