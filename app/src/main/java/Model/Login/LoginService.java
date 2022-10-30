package Model.Login;

import Database.ConnectUserDB;

public class LoginService {
    ConnectUserDB db = new ConnectUserDB();

    /*
    Verifies the username and password against what is available in the db
     */
    public boolean verifyCreds(String username,  String password){
        //Username is in the db
        if(db.getUsername(username) != null){
            if(password.equals(db.getPassword(username))){
                return true;
            }
        }
        return false;
    }
}
