package com.example.automateddrivingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        submit=findViewById(R.id.submitbutton);
        final String msg="Password Changed Successfully";
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
                openLoginActivity();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, ForgotPassword.class);
        startActivity(i);
    }
    public void openLoginActivity()
    {
        Intent i = new Intent(this,LoginActivity.class);
        finish();
        startActivity(i);
    }
}
