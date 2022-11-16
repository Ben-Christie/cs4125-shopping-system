package Model.Login;

import android.content.Context;

import Database.UserDatabase;
import UIControls.DTO.UserEntity;
import UIControls.Retrofit.RetrofitService;
import UIControls.Retrofit.UserAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        UserEntity userEntity = new UserEntity();
        userEntity.setName(email);
        userEntity.setPassword(password);

        RetrofitService retrofitService = new RetrofitService();
        UserAPI userAPI = retrofitService.getRetrofit().create(UserAPI.class);
        boolean accountCreated = false;
        userAPI.save(userEntity).enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                System.out.println("Save finished");
               // accountCreated = response.body().booleanValue();
            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {
                System.out.println("Failed to save");
                //Logger.getLogger((LoginService.class.getName()).log(Level.SEVERE,"",t));
            }
        });
        return true;
    }


}
