package system.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import UIControls.LoginController;

public class LoginUI extends AppCompatActivity {
    EditText editEmail, editPassword;
    Button loginButton;
    TextView toSignUp;
    LoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);

        createObjects();

        loginButton.setOnClickListener(view -> {
            loginController = new LoginController(LoginUI.this);
            if(loginController.verify(editEmail.getText().toString().trim(), editPassword.getText().toString().trim())){


                System.out.println("login is correct");


                //Switch to the home screen now

                Intent intent = new Intent(LoginUI.this, HomeUI.class);
                startActivity(intent);
                finish();


            }else {
                System.out.println("incorrect login");
            }
        });

        toSignUp.setOnClickListener(view -> {
            Intent intent = new Intent(LoginUI.this, SignUpUI.class);
            startActivity(intent);
            finish();
        });

    }

    private void createObjects(){
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        loginButton = findViewById(R.id.loginButton);
        toSignUp = findViewById(R.id.signUpLink);
    }
}