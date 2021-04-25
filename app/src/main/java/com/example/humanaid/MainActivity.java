package com.example.humanaid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        android.os.Bundle extras = getIntent().getExtras();
        String V1 = extras.getString(Intent.EXTRA_TEXT);
        android.util.Log.d("NumberMainActivity", V1);
    }

    public void addRelative(android.view.View v){
        Intent i = new Intent(getApplicationContext(), AddRelative.class);
        startActivity(i);
    }

    public void helplineNumbers(android.view.View v){
        Intent i = new Intent(getApplicationContext(), helplineCall.class);
        startActivity(i);
    }
    public void siren(android.view.View v){
        Intent i = new Intent(getApplicationContext(), siren.class);
        startActivity(i);
    }
    public void triggers(android.view.View v){
        Intent i = new Intent(getApplicationContext(), TrigActivity.class);
        startActivity(i);
    }
    public void location(android.view.View v){
        Intent i = new Intent(getApplicationContext(), location.class);
        startActivity(i);
    }
    public void LogOut(android.view.View v){
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
    }

}
