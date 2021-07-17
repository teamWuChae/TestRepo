package com.example.rhythmproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SotbReady extends AppCompatActivity {

    private Button sotbEasy;
    private Button sotbHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sotb_ready);

        sotbEasy = findViewById(R.id.sotbEasy);
        sotbHard = findViewById(R.id.sotbHard);

        sotbEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SotbReady.this, sotbEasyPlay.class);
                startActivity(intent);
            }
        });

    }

}
