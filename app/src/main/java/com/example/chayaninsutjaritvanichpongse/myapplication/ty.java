package com.example.chayaninsutjaritvanichpongse.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.graphics.Typeface;


public class ty extends AppCompatActivity {
    TextView txtSlogan;
    private Button TyHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty);

        TyHome = findViewById(R.id.TyButton);



        TyHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ty.this, menu.class);
                startActivity(intent);
            }
        });


    }}


