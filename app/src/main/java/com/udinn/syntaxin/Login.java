package com.udinn.syntaxin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(Login.this, Homepage.class);
        startActivity(i);
    }
}