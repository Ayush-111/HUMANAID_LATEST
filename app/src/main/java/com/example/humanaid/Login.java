package com.example.humanaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class Login extends AppCompatActivity {

    EditText mEmail,mPassword;
    Button mLoginBtn;
    android.widget.TextView mCreateBtn;
//    FirebaseAuth fAuth;

    ProgressBar progressBar;

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginBtn=(Button) findViewById(R.id.loginBtn);
        mCreateBtn = findViewById(R.id.createText);



        mLoginBtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));


            }

        });
        mCreateBtn.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                startActivity(new Intent(getApplicationContext(), Registration.class));
            }
        });
    }
}

