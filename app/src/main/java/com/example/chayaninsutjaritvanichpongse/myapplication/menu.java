package com.example.chayaninsutjaritvanichpongse.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Typeface;


public class menu extends AppCompatActivity {
    TextView txtSlogan;
    private Button menuOut, menuCon ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menuOut = findViewById(R.id.MenuOut);
        menuCon = findViewById(R.id.MenuCon);


        menuOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        menuCon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(menu.this, payment.class);
                startActivity(intent);
            }
        });



    }}
