package com.example.abdi.blizzard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdressActivity extends AppCompatActivity {

    private EditText adressInput;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adress);

        name =  getIntent().getStringExtra(Constants.NAME_KEY);
        adressInput = findViewById(R.id.adressInput);

//        ((Button) findViewById(R.id.submitAdresss)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                openNextActivity();
//            }
//        });

    }

    public void openNextActivity(View view) {
        if (!TextUtils.isEmpty(adressInput.getText())){
            Intent intent = new Intent(this, Date_Of_Birth.class);
            intent.putExtra(Constants.ADDRESS_KEY, adressInput.getText().toString());
            intent.putExtra(Constants.NAME_KEY, name);
            startActivity(intent);
        }
    }
}
