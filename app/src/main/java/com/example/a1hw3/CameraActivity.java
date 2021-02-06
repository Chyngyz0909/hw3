package com.example.a1hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {
    ImageView foto;
    ImageView video;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        foto = findViewById(R.id.foto);
        video = findViewById(R.id.video);
        foto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentCamera = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(intentCamera);
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVideoCamera = new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
                startActivity(intentVideoCamera);
            }
        });
    }
}