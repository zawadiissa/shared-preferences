package com.example.sharedpreferences;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ActivityB extends AppCompatActivity {
    TextView username;
    TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        username = (TextView)findViewById(R.id.user);
        password = (TextView)findViewById(R.id.pass);
    }

    public  void load(View v) {
        SharedPreferences sharedPref = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name = sharedPref.getString("username", "");
        String pass = sharedPref.getString("password", "");
        if (name.equals("") || pass.equals("")) {
            Toast.makeText(this,"Data Was Not Found",Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this,"Data Data successfully",Toast.LENGTH_SHORT).show();
            username.setText(name);
            password.setText(pass);
        }
    }
    public  void prev(View v){
        Intent i = new Intent(ActivityB.this,MainActivity.class);
        startActivity(i);
    }
}

