package system.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import UIControls.LoginController;

public class LoginUI extends AppCompatActivity {
    EditText editTextUsername , editTextPassword;
    Button buttonLogin;
    LoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ui);

        createObjects();

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginController = new LoginController();
                if(loginController.verify(editTextUsername.getText().toString().trim(), editTextUsername.getText().toString().trim())){



                    //Go to home page


                }
            }
        });

    }

    private void createObjects(){
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
    }
}