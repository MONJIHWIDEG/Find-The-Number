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

public class number2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number2);
        Button backtochoice =findViewById(R.id.backp2);
        ImageView valid2 =findViewById(R.id.valid2);
        final EditText name2=findViewById(R.id.name2);
        final EditText p2n1 =findViewById(R.id.p2n1);
        final EditText p2n2 =findViewById(R.id.p2n2);
        final EditText p2n3 =findViewById(R.id.p2n3);
        final EditText p2n4 =findViewById(R.id.p2n4);
        final TextView b1=findViewById(R.id.b1);




        Intent int1 = getIntent();
        final String p11 = int1.getStringExtra("p11");
       Intent int5 = getIntent();
       final String p1name = int5.getStringExtra("p1name");
        Intent int2 = getIntent();
        final String p12 = int2.getStringExtra("p12");
        Intent int3 = getIntent();
        final String p13 = int3.getStringExtra("p13");
        Intent int4 = getIntent();
        final String p14 = int4.getStringExtra("p14");

        b1.setText(p1name);



        backtochoice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(number2.this , Choice.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });

        valid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String p21=p2n1.getText().toString();
                String p22=p2n2.getText().toString();
                String p23=p2n3.getText().toString();
                String p24=p2n4.getText().toString();
                String p2name=name2.getText().toString();

                if (TextUtils.isEmpty(p2n1.getText().toString()) ||TextUtils.isEmpty(p2n2.getText().toString()) ||TextUtils.isEmpty(p2n3.getText().toString()) ||TextUtils.isEmpty(p2n4.getText().toString())||TextUtils.isEmpty(name2.getText().toString())  ){
                    Toast.makeText(number2.this,"are you an idiot",Toast.LENGTH_SHORT).show();
                    Toast.makeText(number2.this,"Put your name and your number",Toast.LENGTH_SHORT).show();
                }
                else {

                    int n1=Integer.parseInt(p21);
                    int n2=Integer.parseInt(p22);
                    int n3=Integer.parseInt(p23);
                    int n4=Integer.parseInt(p24);
                    if(n1==n2||n1==n3||n1==n4||n2==n3||n2==n4||n3==n4){
                        Toast.makeText(number2.this,"The numbers must be different",Toast.LENGTH_SHORT).show();


                    }
                    else {





                        //envoi de code de 1ér joueur



                        Intent intent = new Intent(number2.this, FirstTry.class);

                        intent.putExtra("p11", p11);
                        intent.putExtra("p12", p12);
                        intent.putExtra("p13", p13);
                        intent.putExtra("p14", p14);
                        intent.putExtra("p1name", p1name);

                        intent.putExtra("p21", p21);
                        intent.putExtra("p22", p22);
                        intent.putExtra("p23", p23);
                        intent.putExtra("p24", p24);
                        intent.putExtra("p2name", p2name);

                        startActivity(intent);
                    }
                }
            }
        });


    }
}
