package system.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import UIControls.LoginController;

public class LoginUI extends AppCompatActivity {
    EditText editEmail, editPassword;
    Button loginButton;
    LoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);

        createObjects();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginController = new LoginController();
                if(loginController.verify(editEmail.getText().toString().trim(), editEmail.getText().toString().trim())){



                    //Go to home page


                }
            }
        });

    }

    private void createObjects(){
        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        loginButton = findViewById(R.id.loginButton);
    }
}