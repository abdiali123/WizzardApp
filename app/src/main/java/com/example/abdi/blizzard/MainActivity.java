package com.example.abdi.blizzard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(Constants.TAG, "NameActivity onCreate");
        nameInput = (EditText) findViewById(R.id.nameInput);

//        ((Button) findViewById(R.id.SubmitName)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openNextActivity();
//            }
//        });
    }

    public void openNextActivity(View view) {
        if (!TextUtils.isEmpty(nameInput.getText())){
            Intent intent = new Intent(this, AdressActivity.class);
            intent.putExtra(Constants.NAME_KEY, nameInput.getText().toString());
            startActivity(intent);
        }
    }
}
