package com.example.automateddrivingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView txtview;
    private TextView txtview2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtview=findViewById(R.id.textView4);
        button=findViewById(R.id.button2);
        txtview2=findViewById(R.id.textView6);
        txtview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });
        txtview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForgotPassword();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainMenu();
            }
        });
    }
    public void openForgotPassword()
    {
        Intent i = new Intent(this, ForgotPassword.class);
        finish();
        startActivity(i);
    }
    public void openMainMenu()
    {
        Intent i = new Intent(this, MainMenuActivity.class);
        finish();
        startActivity(i);
    }

    public void openSignUp()
    {
        Intent i = new Intent(this, SignUpActivity.class);
        finish();
        startActivity(i);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
