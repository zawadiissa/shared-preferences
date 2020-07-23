package com.example.sharedpreferences;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.editText2);
        password = (EditText) findViewById(R.id.editText3);
    }
    public  void save(View v){
        SharedPreferences pref = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("username",userName.getText().toString());
        editor.putString("password",password.getText().toString());
        editor.commit();
        Toast.makeText(this,"Data saved successfully",Toast.LENGTH_SHORT).show();
    }
    public  void next(View v){

        Intent i = new  Intent(MainActivity.this,ActivityB.class);
        startActivity(i);

    }
}

