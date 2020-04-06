package com.example.automateddrivingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewProfile();
            }
        });
        button1=findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openApplyForTest();
            }
        });
        button2=findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewSchedule();
            }
        });
        button3=findViewById(R.id.button5);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openViewResult();
            }
        });
    }
    public void openViewProfile()
    {
        Intent i = new Intent(this,ViewProfile.class);
        finish();
        startActivity(i);
    }
    public void openApplyForTest()
    {
        Intent i = new Intent(this,ApplyForTest.class);
        finish();
        startActivity(i);
    }
    public void openViewSchedule()
    {
        Intent i = new Intent(this,ViewSchedule.class);
        finish();
        startActivity(i);
    }
    public void openViewResult()
    {
        Intent i = new Intent(this,ViewResult.class);
        finish();
        startActivity(i);
    }

}
