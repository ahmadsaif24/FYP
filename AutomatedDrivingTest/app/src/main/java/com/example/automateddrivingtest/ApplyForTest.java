package com.example.automateddrivingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class ApplyForTest extends AppCompatActivity {
    private Button mDisplayDate;
    private Button mDisplayTime;
    private Button button;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private TimePickerDialog.OnTimeSetListener mTimeSetListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_for_test);
        button=findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            final String msg1 ="Request Submitted Successfully";
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),msg1,Toast.LENGTH_SHORT).show();
            }
        });
        mDisplayDate=findViewById(R.id.datetebutton);
        mDisplayTime=findViewById(R.id.timebutton);
        mDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal1= Calendar.getInstance();
                int hours = cal1.get(Calendar.HOUR_OF_DAY);
                int minutes=cal1.get(Calendar.MINUTE);
                TimePickerDialog dialog=new TimePickerDialog(v.getContext(),android.R.style.Theme_Holo_Dialog_MinWidth,mTimeSetListener,hours,minutes,false);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mTimeSetListener = new TimePickerDialog.OnTimeSetListener()
        {
            final String msg ="Time Selected Successfully";
            @Override
            public void onTimeSet(TimePicker view, int hours, int minutes) {

                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }
        };
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal= Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog=new DatePickerDialog(v.getContext(),android.R.style.Theme_Holo_Dialog_MinWidth,mDateSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener()
        {
            final String msg ="Date Selected Successfully";
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month=month+1;
                String date= month + "/" + dayOfMonth + "/" + year;
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
//                mDisplayDate.setText(date);
            }
        };
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainMenuActivity.class);
        startActivity(i);
    }
}
