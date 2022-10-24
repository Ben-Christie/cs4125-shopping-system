package UIControls;

import Database.ConnectUserDB;

public class Login {

    public boolean verify(String name, String password){
        ConnectUserDB db = new ConnectUserDB();
        if(db.getCreds(name, password)){
            return true;
        }else{
            return false;
        }
    }


}
