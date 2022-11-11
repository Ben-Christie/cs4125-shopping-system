package UIControls;


import android.content.Context;

import Model.Login.LoginService;

public class LoginController {
    LoginService loginService;

    public LoginController(Context context){
        loginService = new LoginService(context);
    }

    public boolean verify(String email, String password){
        return loginService.verifyCreds(email,password);
    }

    public boolean createAccount(String email, String password){
        return loginService.createAccount(email,password);
    }


}
