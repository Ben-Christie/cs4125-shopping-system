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
        System.out.println("Cred entered : " + email + "  " + password);
        //Username is in the db
        //db.getAll();
        if(db.getEmail(email) != null){
            System.out.println("email is working");
            return db.verifyPassword(email,password);
        }
        return false;
    }
    /*
    Create an account and adds said information to the db
     */
    public boolean createAccount(String email, String password){
        if(db.getEmail(email) != null){
            //email is already taken
            return false;
        }else{
            return true;
            //add username and password to the db
        }
    }
}
