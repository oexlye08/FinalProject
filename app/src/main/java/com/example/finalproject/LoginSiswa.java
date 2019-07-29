package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginSiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_siswa);
    }

    public void signSiswa(View view) {
        Intent intent=new Intent(LoginSiswa.this, HomeSiswa.class);
        startActivities(new Intent[]{intent});
    }
}
