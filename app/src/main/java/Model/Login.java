package Model;

public class Login {


    public boolean verifyCreds(String passwordUi,  String passwordDb){

        //any dehashing etc can be written here


        if(passwordUi.equals(passwordDb)){
            return true;
        }

        return false;
    }
}
