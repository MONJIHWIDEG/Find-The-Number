package com.example.asus.matchstick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class number1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number1);
        Button backtochoice =findViewById(R.id.backp1);
        ImageView valid1 =findViewById(R.id.valid1);
        final EditText p1n1 =findViewById(R.id.p1n1);
        final EditText p1n2 =findViewById(R.id.p1n2);
        final EditText p1n3 =findViewById(R.id.p1n3);
        final EditText p1n4 =findViewById(R.id.p1n4);
        final EditText name1 =findViewById(R.id.name1);

       /* Intent intent = getIntent();
        String ms = intent.getStringExtra("mssg");
        Intent intent1 = getIntent();
        String mss = intent.getStringExtra("msg");
        TextView tt1 =findViewById(R.id.textView);
        tt1.setText(ms+" "+mss);*/
        backtochoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number1.this , Choice.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });


       valid1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String p11=p1n1.getText().toString();
               String p1name=name1.getText().toString();
               String p12=p1n2.getText().toString();
               String p13=p1n3.getText().toString();
               String p14=p1n4.getText().toString();

               if (TextUtils.isEmpty(p1n1.getText().toString()) ||TextUtils.isEmpty(p1n2.getText().toString()) ||TextUtils.isEmpty(p1n3.getText().toString()) ||TextUtils.isEmpty(p1n4.getText().toString())||TextUtils.isEmpty(name1.getText().toString())  ){
                   Toast.makeText(number1.this,"don't angry me",Toast.LENGTH_SHORT).show();
                   Toast.makeText(number1.this,"Put your name and your number",Toast.LENGTH_SHORT).show();
               }


               else {
                   int n1=Integer.parseInt(p11);
                   int n2=Integer.parseInt(p12);
                   int n3=Integer.parseInt(p13);
                   int n4=Integer.parseInt(p14);
                   if(n1==n2||n1==n3||n1==n4||n2==n3||n2==n4||n3==n4){
                       Toast.makeText(number1.this,"The numbers must be different",Toast.LENGTH_SHORT).show();


                   }
                   else {


                       Intent intent = new Intent(number1.this, number2.class);
                       intent.putExtra("p11", p11);
                       intent.putExtra("p12", p12);
                       intent.putExtra("p13", p13);
                       intent.putExtra("p14", p14);
                       intent.putExtra("name1", p1name);

                       startActivity(intent);
                   }

               }
           }
       });

    }
}
