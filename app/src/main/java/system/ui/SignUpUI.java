package system.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpUI extends AppCompatActivity {
    EditText editEmail, editPassword, editConfirmPassword;
    Button signUpButton;
    TextView toLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_ui);

        createObjects();

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void createObjects() {
        editEmail = findViewById(R.id.signUpEmail);
        editPassword = findViewById(R.id.signUpPassword);
        editConfirmPassword = findViewById(R.id.signUpConfirmPassword);
        signUpButton = findViewById(R.id.signUpButton);
        toLogin = findViewById(R.id.loginLink);
    }
}