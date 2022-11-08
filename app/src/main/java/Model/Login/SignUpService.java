package Model.Login;

import Database.UserDatabase;

public class SignUpService {
    UserDatabase db = new UserDatabase();

    /*
        verify credentials by checking email isn't in database already
    */
    public boolean emailNotInDb(String email) {
        if(db.getEmail(email) != null) {
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
