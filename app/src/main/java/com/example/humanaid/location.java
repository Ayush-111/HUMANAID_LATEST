package com.example.humanaid;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.Toast;

public class location extends AppCompatActivity {

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Button btnAdd = (Button) findViewById(R.id.btnAdd1);
        btnAdd.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Toast.makeText(getApplicationContext(), "Location Tracking  Service Activated!!", Toast.LENGTH_LONG).show();
            }
        });

    }
}