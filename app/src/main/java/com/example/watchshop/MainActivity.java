package com.example.watchshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bAddWatch, bShowImages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAddWatch = (Button) findViewById(R.id.bAddWatch);
        bAddWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddWatch();
            }
        });

        // Button: show foods
        //
        bShowImages = (Button) findViewById(R.id.bShowWatch);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowWatch();
            }
        });

    }

    private void AddWatch(){
        Intent intent = new Intent(MainActivity.this, AddWatch.class);
        MainActivity.this.startActivity(intent);
    }

    private void ShowWatch(){
        Intent intent = new Intent(MainActivity.this, ShowWatch.class);
        MainActivity.this.startActivity(intent);
    }
}