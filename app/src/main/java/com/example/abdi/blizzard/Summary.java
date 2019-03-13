package com.example.abdi.blizzard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

public class Summary extends AppCompatActivity {

    TextView nameSummary;
    TextView AdressSummary;
    TextView date_of_birthSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        nameSummary = findViewById(R.id.nameSummary);
        AdressSummary = findViewById(R.id.AdressSummary);
        date_of_birthSummary = findViewById(R.id.date_of_birthSummary);

        Intent intent = getIntent();

        nameSummary.setText(intent.getStringExtra(Constants.NAME_KEY));
        AdressSummary.setText(intent.getStringExtra(Constants.ADDRESS_KEY));
        date_of_birthSummary.setText(intent.getStringExtra(Constants.DATE_OF_BIRTH_KEY));

        Log.i(Constants.TAG, "SummaryActivity onCreate");


    }
}
