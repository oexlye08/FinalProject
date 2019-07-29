package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginGuru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_guru);
    }

    public void signGuru(View view) {
        Intent intent= new Intent(LoginGuru.this, HomeGuru.class);
        startActivities(new Intent[]{intent});
    }
}
