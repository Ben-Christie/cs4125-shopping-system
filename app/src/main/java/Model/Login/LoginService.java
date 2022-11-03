package Model.Login;

import Database.ConnectUserDB;

public class LoginService {
    ConnectUserDB db = new ConnectUserDB();

    /*
    Verifies the username and password against what is available in the db
     */
    public boolean verifyCreds(String email,  String password){
        //Username is in the db
        if(db.getEmail(email) != null){
            if(password.equals(db.getPassword(email))){
                return true;
            }
        }
        return false;
    }
}
