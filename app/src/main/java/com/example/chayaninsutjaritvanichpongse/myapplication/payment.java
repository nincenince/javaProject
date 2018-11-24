package com.example.chayaninsutjaritvanichpongse.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.graphics.Typeface;


public class payment extends AppCompatActivity {
    TextView txtSlogan;
    private Button MakePayment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        MakePayment = findViewById(R.id.paymentCon);


        MakePayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(payment.this, ty.class);
                startActivity(intent);
            }
        });


    }}

