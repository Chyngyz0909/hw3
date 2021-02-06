package com.example.a1hw3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView edt;
    ImageView camera;
    ImageView contacts;
    ImageView google;
    TextView bish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
       clickListeners();
    }

    private void InitViews() {
        camera = findViewById(R.id.cam);
        contacts = findViewById(R.id.cont);
        google = findViewById(R.id.goog);
        bish = findViewById(R.id.bish);
    }

    private void clickListeners() {

        bish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditCity.class);
                startActivityForResult(intent, 500);
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_tel.class);
                startActivity(intent);
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivitySearch.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 202: {
                if(resultCode == RESULT_OK){
                    String text;
                    text = data.getStringExtra("city");
                    bish.setText(text);
                }
            }
            case 203:{
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"google");
                startActivity(intent);
            }

        }
    }
}