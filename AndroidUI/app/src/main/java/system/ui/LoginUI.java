package system.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import UIControls.DTO.UserDTO;
import UIControls.LoginController;
import UIControls.Retrofit.RetrofitService;
import UIControls.Retrofit.UserAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginUI extends AppCompatActivity {
    EditText editEmail, editPassword;
    Button loginButton;
    TextView toSignUp;
    LoginController loginController;
    RetrofitService retrofitService;
    UserAPI userAPI;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);
        loginController = new LoginController(LoginUI.this);
        retrofitService = new RetrofitService();
        userAPI = retrofitService.getRetrofit().create(UserAPI.class);

        createObjects();

        loginButton.setOnClickListener(view -> {
            loginController.verify(editEmail.getText().toString().trim(), editPassword.getText().toString().trim());
        });

        toSignUp.setOnClickListener(view -> {
            Intent intent = new Intent(LoginUI.this, SignUpUI.class);
            startActivity(intent);
            finish();
        });

    }

    private void Login(String email, String password) {
        UserDTO userDTO = new UserDTO(email, password);

        Call<Boolean> loginResponse = userAPI.veriftyCreds(userDTO);
        loginResponse.enqueue(new Callback<Boolean>() {
            @Override
            public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                if(response.isSuccessful()){
                    if (response.body()) {
                        Toast.makeText(LoginUI.this, "Successful !", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginUI.this, HomeUI.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(LoginUI.this, "Invalid !", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<Boolean> call, Throwable t) {

            }
        });
    }


    private void createObjects(){
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        loginButton = findViewById(R.id.loginButton);
        toSignUp = findViewById(R.id.signUpLink);
    }
}