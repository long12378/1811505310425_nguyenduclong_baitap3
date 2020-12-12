package com.example.cuoikythandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {
    TextView boqua;
    Button facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        boqua =(TextView) findViewById(R.id.quitlogin);
        facebook = (Button) findViewById(R.id.btnfacebook425);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,MainActivity.class);
                startActivity(intent);
            }
        });
        boqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}