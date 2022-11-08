package Model.Login;

import android.content.Context;

import Database.UserDatabase;

public class LoginService {
    UserDatabase db;
    Context context;

    public LoginService(Context context){
        this.context = context;
        db = new UserDatabase(context);
    }

    /*
    Verifies the username and password against what is available in the db
     */
    public boolean verifyCreds(String email,  String password){
        System.out.println(email);
        //Username is in the db
        if(db.getEmail(email) != null){
            System.out.println("email is working");
            return db.verifyPassword(email,password);
        }
        return false;

    }
}
