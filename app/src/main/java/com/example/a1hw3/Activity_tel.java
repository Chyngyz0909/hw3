package com.example.a1hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_tel extends AppCompatActivity {
    EditText telN;
    Button btn1;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tel);
        telN = findViewById(R.id.telN);
        btn1 = findViewById(R.id.btn1);
        btnback = findViewById(R.id.btnback);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Activity_tel.this,MainActivity.class);
               startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intentContacts = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+996)"+telN.getText().toString().trim()));

            }
        });
    }
}