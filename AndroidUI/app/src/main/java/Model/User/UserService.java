package Model.User;

import android.content.Context;

import androidx.annotation.NonNull;
import UIControls.DTO.UserDTO;
import UIControls.Retrofit.RetrofitService;
import UIControls.Retrofit.UserAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserService {
    RetrofitService retrofitService;
    UserAPI userAPI;

    public UserService(){
        retrofitService = new RetrofitService();
        userAPI = retrofitService.getRetrofit().create(UserAPI.class);
    }


    /*
    Verifies the username and password against what is available in the db
     */
    boolean verified;
    public boolean verifyCreds(String email,  String password){
        UserDTO userDTO = new UserDTO(email,password);




        userAPI.veriftyCreds(userDTO).enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                System.out.println("Verified the login response = " + response.body());
                verified = response.body();
            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {
                System.out.println("The login is not correct ");
                verified = false;
            }
        });
        
        System.out.println("Verified = " + verified);
        return verified;

    }



    /*
    Create an account and adds said information to the db
     */
    boolean accountCreated;
    public boolean createAccount(String email, String password){
        UserDTO userDTO = new UserDTO(email,password);


        userAPI.save(userDTO).enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                System.out.println("Save finished");
                accountCreated = response.body();
            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {
                System.out.println("Failed to save");
                accountCreated = false;
            }
        });
        return accountCreated;
    }


}
