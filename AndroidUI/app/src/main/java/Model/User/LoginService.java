package Model.User;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import UIControls.DTO.UserDTO;
import UIControls.Retrofit.RetrofitService;
import UIControls.Retrofit.UserAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import system.ui.HomeUI;
import system.ui.LoginUI;
import system.ui.SignUpUI;

public class LoginService {
    RetrofitService retrofitService;
    UserAPI userAPI;
    Context context;

    public LoginService(Context context){
        this.context = context;
        retrofitService = new RetrofitService();
        userAPI = retrofitService.getRetrofit().create(UserAPI.class);
    }


    /*
    Verifies the username and password against what is available in the db
     */
    public boolean verifyCreds(String email,  String password){
        if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(context,"Empty field!", Toast.LENGTH_SHORT).show();
        }

        UserDTO userDTO = new UserDTO(email,password);


        userAPI.veriftyCreds(userDTO).enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                if(response.body()){
                    Toast.makeText(context,"Login successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, HomeUI.class);
                    ((Activity)context).startActivity(intent);
                }else{
                    Toast.makeText(context,"Login failed!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {
                Toast.makeText(context,"Failed to connect!", Toast.LENGTH_SHORT).show();

            }
        });
        return true;
    }


}
