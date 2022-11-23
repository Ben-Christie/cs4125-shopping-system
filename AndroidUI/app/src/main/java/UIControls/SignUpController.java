package UIControls;

import android.content.Context;

import Model.User.LoginService;
import Model.User.SignUpService;

public class SignUpController {
    SignUpService signUpService;
    Context context;


    public SignUpController(Context context){
        this.context = context;
        signUpService = new SignUpService(context);

    }
    public void createAccount(String email, String password){
        signUpService.createAccount(email,password);
    }
}
