package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class index extends AppCompatActivity {
    Button Admin, Guru, Siswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        Admin=findViewById(R.id.Admin);
        Guru=findViewById(R.id.Guru);
        Siswa=findViewById(R.id.Siswa);

    }

    public void btnAdmin(View view) {

        Intent intent = new Intent(index.this, LoginAdmin.class);
        startActivities(new Intent[]{intent});
    }


    public void btnGuru(View view) {
        Intent intent=new Intent(index.this, LoginGuru.class);
        startActivities(new Intent[]{intent});
    }

    public void btnSiswa(View view) {
        Intent intent=new Intent(index.this, LoginSiswa.class);
        startActivities(new Intent[]{intent});
    }
}
