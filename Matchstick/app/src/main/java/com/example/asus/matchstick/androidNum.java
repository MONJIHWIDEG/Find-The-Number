package com.example.asus.matchstick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class androidNum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_num);

        ImageView valid =findViewById(R.id.valid);
        final EditText p1 =findViewById(R.id.p1);
        final EditText p2 =findViewById(R.id.p2);
        final EditText p3 =findViewById(R.id.p3);
        final EditText p4 =findViewById(R.id.p4);
        final EditText name =findViewById(R.id.name);

        final Button back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(androidNum.this, Choice.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });





        final String m1=p1.getText().toString();
        final String name1=name.getText().toString();
        final String m2=p2.getText().toString();
        final String m3=p3.getText().toString();
        final String m4=p4.getText().toString();

        valid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(p1.getText().toString()) ||TextUtils.isEmpty(p2.getText().toString()) ||TextUtils.isEmpty(p3.getText().toString()) ||TextUtils.isEmpty(p4.getText().toString())||TextUtils.isEmpty(name.getText().toString())  ){
                    Toast.makeText(androidNum.this,"don't angry me",Toast.LENGTH_SHORT).show();
                    Toast.makeText(androidNum.this,"Put your name and your number",Toast.LENGTH_SHORT).show();
                }
                else {
                    int n1=Integer.parseInt(p1.getText().toString());
                    int n2=Integer.parseInt(p2.getText().toString());
                    int n3=Integer.parseInt(p3.getText().toString());
                    int n4=Integer.parseInt(p4.getText().toString());

                    if(n1==n2||n1==n3||n1==n4||n2==n3||n2==n4||n3==n4){
                        Toast.makeText(androidNum.this,"The numbers must be different",Toast.LENGTH_SHORT).show();


                    }
                    else {


                        Intent intent = new Intent(androidNum.this, android.class);
                        intent.putExtra("p1", p1.getText().toString());
                        intent.putExtra("p2", p2.getText().toString());
                        intent.putExtra("p3", p3.getText().toString());
                        intent.putExtra("p4", p4.getText().toString());
                        intent.putExtra("name", name.getText().toString());

                        startActivity(intent);
                    }

                }
            }
        });


    }
}
