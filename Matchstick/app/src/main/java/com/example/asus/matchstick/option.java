package com.example.asus.matchstick;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        TextView t1=findViewById(R.id.tx1);
        TextView t2=findViewById(R.id.tx2);
        TextView t3=findViewById(R.id.tx3);
        TextView t4=findViewById(R.id.tx4);
        TextView t5=findViewById(R.id.tx5);
        setContentView(R.layout.activity_option);
        ImageView more =findViewById(R.id.more);
        Button back1 = findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(option.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t1=findViewById(R.id.tx1);
                TextView t2=findViewById(R.id.tx2);
                TextView t3=findViewById(R.id.tx3);
                TextView t4=findViewById(R.id.tx4);
                TextView t5=findViewById(R.id.tx5);
                TextView t0=findViewById(R.id.tx0);
                TextView t6=findViewById(R.id.tx6);
                TextView t7=findViewById(R.id.tx7);


                t1.setVisibility(View.VISIBLE);
                t0.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                t7.setVisibility(View.VISIBLE);

            }
        });
    }
}
