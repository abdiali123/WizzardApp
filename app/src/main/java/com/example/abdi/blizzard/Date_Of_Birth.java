package com.example.abdi.blizzard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date_Of_Birth extends AppCompatActivity {

    private DatePicker DateOfBirth;
    private String name;
    private String adress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date__of__birth);

        Intent i = getIntent();
        name = i.getStringExtra(Constants.NAME_KEY);
        adress = i.getStringExtra(Constants.ADDRESS_KEY);
        DateOfBirth = (DatePicker) findViewById(R.id.DateOfBirth);
        DateOfBirth.updateDate(1986, 4, 14);
        Log.i(Constants.TAG, "DateOfBirthActivity onCreate");

//        ((Button) findViewById(R.id.submitDateOfBirth)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openNextActivity(v);
//            }
//        });

    }

    public void openNextActivity(View v) {
        Intent intent = new Intent(this, Summary.class);
        intent.putExtra(Constants.ADDRESS_KEY, adress);
        intent.putExtra(Constants.NAME_KEY, name);

        int day = DateOfBirth.getDayOfMonth();
        int month = DateOfBirth.getMonth();
        int year = DateOfBirth.getYear();

        Calendar calender = Calendar.getInstance();
        calender.set(year, month, day);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formatedDate = sdf.format(calender.getTime());
        intent.putExtra(Constants.DATE_OF_BIRTH_KEY, formatedDate);
        startActivity(intent);
    }
}

