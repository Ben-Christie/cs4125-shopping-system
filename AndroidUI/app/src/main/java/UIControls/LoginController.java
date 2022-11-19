package UIControls;


import android.content.Context;

import Model.User.LoginService;
import Model.User.SignUpService;

public class LoginController {
    LoginService loginService;
    SignUpService signUpService;
    Context context;

    public LoginController(Context context){
        this.context = context;
        loginService = new LoginService(context);

    }

    public boolean verify(String email, String password){
            return loginService.verifyCreds(email,password);
    }


}
