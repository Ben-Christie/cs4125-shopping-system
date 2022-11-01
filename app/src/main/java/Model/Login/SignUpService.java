package Model.Login;

import Database.ConnectUserDB;

public class SignUpService {
    ConnectUserDB db = new ConnectUserDB();

    /*
        verify credentials by checking email isn't in database already
    */
    public boolean emailNotInDb(String username) {
        if(db.getUsername(username) != null) {
            return false;
        }
        return true;
    }

    /*
        verify credentials by checking password and confirmed password match
    */
    public boolean comparePasswords(String password, String confirmPassword) {
        if(password.equals(confirmPassword)) {
            return true;
        }
        return false;
    }

}
