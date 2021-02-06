package com.example.a1hw3;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivitySearch extends AppCompatActivity {

    Button search1;
    EditText inptxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        search1 = findViewById(R.id.search1);
        inptxt = findViewById(R.id.inptxt);
        search1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoogle = new Intent(Intent.ACTION_WEB_SEARCH);
                intentGoogle.putExtra(SearchManager.QUERY,inptxt.getText().toString().trim());
                startActivity(intentGoogle);
            }
        });
    }
}
