package Model.User;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import UIControls.DTO.UserDTO;
import UIControls.Retrofit.RetrofitService;
import UIControls.Retrofit.UserAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import system.ui.HomeUI;
import system.ui.LoginUI;

public class SignUpService {

    RetrofitService retrofitService;
    UserAPI userAPI;
    Context context;

    public SignUpService(Context context){
        this.context = context;
        retrofitService = new RetrofitService();
        userAPI = retrofitService.getRetrofit().create(UserAPI.class);
    }

    /*
Create an account and adds said information to the db
 */
    public boolean createAccount(String email, String password){
        UserDTO userDTO = new UserDTO(email,password);


        userAPI.save(userDTO).enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                if(response.body()){
                    Toast.makeText(context,"Account created!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, LoginUI.class);
                    ((Activity)context).startActivity(intent);
                }else{
                    Toast.makeText(context,"Unable to make account!", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {
                Toast.makeText(context,"Connection Failed!", Toast.LENGTH_SHORT).show();


            }
        });
        return true;
    }
}
