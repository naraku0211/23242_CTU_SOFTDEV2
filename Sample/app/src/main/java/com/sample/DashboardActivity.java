package com.sample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    TextView username, password;
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        username = findViewById(R.id.viewUsername);
        password = findViewById(R.id.viewPassword);

        username.setText(getIntent().getExtras().getString("username"));
        password.setText(getIntent().getExtras().getString("password"));
    }
}
