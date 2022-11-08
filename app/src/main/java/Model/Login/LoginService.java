package Model.Login;

import Database.UserDatabase;

public class LoginService {
    UserDatabase db = new UserDatabase();

    /*
    Verifies the username and password against what is available in the db
     */
    public boolean verifyCreds(String email,  String password){
        //Username is in the db
        if(db.getEmail(email) != null){
            return db.verifyPassword(email,password);
        }
        return false;

    }
}
