package com.example.humanaid;


import android.widget.Button;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class AddRelative extends AppCompatActivity {


    Button btnAdd;

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_relative);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Toast.makeText(getApplicationContext(), "Contact Added Successfully!!", Toast.LENGTH_LONG).show();
            }
        });



    }

}

