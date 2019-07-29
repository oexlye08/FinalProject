package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class LoginAdmin extends AppCompatActivity {
//    private EditText username, password;
//    private Context context;
//    SharedPreferences sharedPreferences;
//    ImageView login;

//    public static SharedPreferences getSharedPreference(Context context){
//        return PreferenceManager.getDefaultSharedPreferences(context);

//    public static final String KEYPREF = "Key Preferences";
//    public static final String KEYUSERNAME = "Key Username";
//    public static final String KEYPASSWORD = "Key Password";
//    SharedPreferences preferences;
//
//    private ProgressDialog pDialog;
//    boolean doubleBackToExitPressedOnce = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);
//
//        pDialog = new ProgressDialog(this);
//        username = findViewById(R.id.userAdmin);
//        password = findViewById(R.id.passAdmin);
//        login = findViewById(R.id.login);
//
//        sharedPreferences = getSharedPreferences("DATA", Context.MODE_PRIVATE);
//
//        preferences = getSharedPreferences("KEYPREF", Context.MODE_PRIVATE);
//        preferences = getSharedPreferences(KEYPREF, Context.MODE_PRIVATE);
//        if (preferences.contains(KEYUSERNAME) && (preferences.contains(KEYPASSWORD))) {
//            username.setText(preferences.getString(KEYUSERNAME, ""));
//            password.setText(preferences.getString(KEYPASSWORD, ""));
//        }
//
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
////                login();
//                if (!username.getText().toString().equals("") || !password.getText().toString().equals(""))
//                {
//                    savelogin();
//                }
//                else
//                {
//                    Toast.makeText(LoginAdmin.this,"Username atau Password belum terisi", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//
//
    }

    public void signAdmin(View view) {
        Intent intent= new Intent(LoginAdmin.this, HomeAdmin.class);
        startActivities(new Intent[]{intent});
    }
//
//    public void savelogin(){
//        //algoritma untuk POST login
//        final ProgressDialog progressDialog = new ProgressDialog(this);
//        progressDialog.setMessage("Loading...");
//        progressDialog.show();
//
//        StringRequest stringRequest = new StringRequest(Request.Method.POST, //request post
//                "https://finalprojectdts.000webhostapp.com/tugasakhir/login.php",
//                new Response.Listener<String>(){
//                    @Override
//                    public void onResponse(String response){
//                        Log.d("CREATE", response);
//                        try{
//                            //mengubah string menjadi jsonObject
//                            JSONObject object = new JSONObject(response);
//                            //mendapatkan string dari status
//                            String status = object.getString("status");
//                            //jika berhasil ditambahkan
//                            if(status.equalsIgnoreCase("success")){
//                                //Menyimpan data Login
//                                JSONObject loginData = object.getJSONObject("data");
//                                SharedPreferences.Editor editor = sharedPreferences.edit();
//                                editor.putBoolean("login", true);
//                                editor.putString("id", loginData.getString("id"));
//                                editor.putString("username", loginData.getString("username"));
//                                editor.putString("nama", loginData.getString("nama"));
//
//                                editor.commit();
//
//                                //menampilkan pesan berhasil
//                                Toast.makeText(LoginAdmin.this,object.getString("message"),Toast.LENGTH_LONG).show();
//                                Intent intent = new Intent(LoginAdmin.this,HomeAdmin.class);
//                                startActivity(intent);
//                                progressDialog.dismiss();
//                                finish();
//                            }else {
//                                //menampilkan pesan gagal
//                                progressDialog.dismiss();
//                                Toast.makeText(LoginAdmin.this, object.getString("message"), Toast.LENGTH_LONG).show();
//                            }
//                        }catch (Exception e){
//                            Log.d("CREATE", e.toString());
//                            progressDialog.dismiss();
//                        }
//                    }
//                },
//                new Response.ErrorListener(){
//                    @Override
//                    public void onErrorResponse(VolleyError error){
//                        Log.d("CREATE", error.toString());
//                        Toast.makeText(LoginAdmin.this,"<!> Pastikan Perangkat Sudah Tersambung Internet",Toast.LENGTH_LONG).show();
//                        progressDialog.dismiss();
//                    }
//                }){
//
//            @Override
//            protected Map<String,String> getParams(){
//                Map<String,String> params = new HashMap<String, String>();
//                //menambahkan parameter post, nama put sama dengan nama variable pada webservice PHP
//                params.put("username", username.getText().toString());
//                params.put("password", password.getText().toString());
//
//                Log.d("usertesss", username.toString());
//                return params;
//            }
//        };
//        AppController.getInstance().addToRequestQueue(stringRequest);
//    }
//
//    public void loginAkun(View view) {
//        String user = username.getText().toString();
//        String pass = password.getText().toString();
//        SharedPreferences.Editor editor = preferences.edit();
//        editor.putString(KEYUSERNAME, user);
//        editor.putString(KEYPASSWORD, pass);
////        editor.apply();
//        editor.commit();
//        Toast.makeText(this, "Anda berhasil masuk", Toast.LENGTH_SHORT).show();
//        //menyimpan data user dan pass
//        //dengan method appley
//    }
//
//    private void gotoCourseActivity() {
//        Intent intent = new Intent(this, HomeAdmin.class);
//        startActivity(intent);
//        finish();
//    }
//
//    private void showDialog() {
//        if (!pDialog.isShowing())
//            pDialog.show();
//    }
//
//    private void hideDialog() {
//        if (pDialog.isShowing())
//            pDialog.dismiss();
//    }
//    @Override
//    public void onBackPressed() {
//        //fungsi untuk tombol keluar aplikasi
//        if (doubleBackToExitPressedOnce) {
//            super.onBackPressed();
//            return;
//        }
//
//        this.doubleBackToExitPressedOnce = true;
//        Toast.makeText(this, "Tab dua kali untuk keluar", Toast.LENGTH_SHORT).show();
//
//        new Handler().postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
//                doubleBackToExitPressedOnce=false;
//            }
//        }, 2000);
//    }



}
