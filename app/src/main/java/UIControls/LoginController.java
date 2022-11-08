package UIControls;


import android.content.Context;

import Model.Login.LoginService;

public class LoginController {
    LoginService loginService;

    public LoginController(Context context){
        loginService = new LoginService(context);
    }

    public boolean verify(String username, String password){

        return loginService.verifyCreds(username,password);
    }


}
