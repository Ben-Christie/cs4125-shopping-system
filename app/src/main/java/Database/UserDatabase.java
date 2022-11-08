package Database;

import java.util.ArrayList;
import java.util.List;

import Database.DBEntity.UserDBEntity;

public class UserDatabase extends ConnectDatabase{
    List<UserDBEntity> usersDbInfo = new ArrayList<>();
    public UserDatabase(){
        super("src\\\\main\\\\java\\\\Database\\\\CSVFiles\\\\users.csv");
                            //\CS4125-Online-Shopping-System\app\src\main\java\Database\CSVFiles
        parseDbInfo();
    }

    private void parseDbInfo(){
        String[] fields = dbInformation.split(",");
        if (fields.length < 3){
            System.out.println("Problem");
        }
        for(int i = 0; i <= fields.length-3; i= i +3){
            usersDbInfo.add(new UserDBEntity(Integer.parseInt(fields[i]), fields[i+1], fields[i+2]));
        }
    }

    public int getUserId(String email){
        for(UserDBEntity user : usersDbInfo){
            if (email.equals(user.getEmail())){
                return user.getUserId();
            }
        }
        return -1;
    }

    public String getEmail(String email){
        for(UserDBEntity user : usersDbInfo){
            if(email.equals(user.getEmail())){
                return user.getEmail();
            }
        }
        return null;
    }

    public boolean verifyPassword(String email, String password){
        for(UserDBEntity user : usersDbInfo){
            if(email.equals(user.getEmail())){
                return user.getPassword().equalsIgnoreCase(password);
            }
        }
        return false;
    }
    
}
