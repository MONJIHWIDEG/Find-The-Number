package com.example.asus.matchstick;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class punish extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punish);
        Button fini=findViewById(R.id.fini);
        fini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(punish.this , MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

         TextView punishtext =findViewById(R.id.punishtext);
          List<String> list=new ArrayList<String>();
        list.add("buy me a coffee");
        list.add("buy me a sandwich");
        list.add("Read a book this week");
        list.add("Start new online course");
        list.add("Stop smoking");
        list.add("practice sports each morning");
        list.add("buy me Icecream");
        list.add("Do my homework");
        list.add("Clean my room :p");
        list.add("make me happy :)");
        Random rn = new Random();
        int x=rn.nextInt(9)+1;

        punishtext.setText(list.get(x));



    }
}
