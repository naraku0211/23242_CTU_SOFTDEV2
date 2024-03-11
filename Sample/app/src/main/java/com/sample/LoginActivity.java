package com.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    private EditText username, password;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(view -> {
            String user = username.getText().toString();
            String pass = password.getText().toString();

            if (user.equals("admin") && pass.equals("admin")){
                // if true, then go to Dashboard activity
                Log.d("LOGIN", "Username and password is correct.");
                Toast.makeText(this, "Username and password is correct.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                intent.putExtra("username",user);
                intent.putExtra("password",pass);
                startActivity(intent);
            }
            else{
                // display a box that tells "Incorrect details".
                Log.d("LOGIN", "Username/password is incorrect.");
                Toast.makeText(this, "Username/password is incorrect. Try Again.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
