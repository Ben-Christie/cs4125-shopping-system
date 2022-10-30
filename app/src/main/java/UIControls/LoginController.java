package UIControls;


import Model.Login.LoginService;

public class LoginController {
    LoginService loginService = new LoginService();

    public boolean verify(String username, String password){
        return loginService.verifyCreds(username,password);
    }


}
