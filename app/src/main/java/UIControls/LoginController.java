package UIControls;

import Database.ConnectUserDB;
import Model.Login;

public class LoginController {
    ConnectUserDB db = new ConnectUserDB();
    Login login = new Login();

    public boolean verify(String username, String password){


        //First check username exits in the DB
        if(db.getUsername(username)){
            return login.verifyCreds(password, db.getPassword(username));
        }else{
            return false;
        }


    }


}
