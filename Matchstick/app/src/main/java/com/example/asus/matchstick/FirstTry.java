package com.example.asus.matchstick;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstTry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first_try);
        final EditText  gesp21=findViewById(R.id.gesp21);
        final EditText gesp22 =findViewById(R.id.gesp22);
        final EditText gesp23 =findViewById(R.id.gesp23);
        final EditText gesp24 =findViewById(R.id.gesp24);

        final Button back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstTry.this, Choice.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });


        final Button passto2 =findViewById(R.id.gop2);
        Button check =findViewById(R.id.check);
        int tt=0;
        int vv=0;


        Intent int1 = getIntent();
        final String p11 = int1.getStringExtra("p11");
        Intent int5 = getIntent();
        final String p1name = int1.getStringExtra("p1name");
        Intent int2 = getIntent();
        final String p12 = int2.getStringExtra("p12");
        Intent int3 = getIntent();
        final String p13 = int3.getStringExtra("p13");
        Intent int4 = getIntent();
        final String p14 = int4.getStringExtra("p14");


        Intent int7 = getIntent();
        final String p21 = int1.getStringExtra("p21");
        Intent int8 = getIntent();
        final String p2name = int1.getStringExtra("p2name");
        Intent int9 = getIntent();
        final String p22 = int2.getStringExtra("p22");
        Intent int6 = getIntent();
        final String p23 = int3.getStringExtra("p23");
        Intent int0 = getIntent();
        final String p24 = int4.getStringExtra("p24");


        passto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(gesp21.getText().toString()) ||TextUtils.isEmpty(gesp22.getText().toString()) ||TextUtils.isEmpty(gesp23.getText().toString()) ||TextUtils.isEmpty(gesp24.getText().toString())  ){
                    Toast.makeText(FirstTry.this,"your try is minus",Toast.LENGTH_SHORT).show();
                    Toast.makeText(FirstTry.this,"You don't want to try",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(FirstTry.this , Second_Try.class);
                    intent.putExtra("p11",p11);
                    intent.putExtra("p12",p12);
                    intent.putExtra("p13",p13);
                    intent.putExtra("p14",p14);
                    intent.putExtra("p1name",p1name);
                    intent.putExtra("p2name",p2name);
                    intent.putExtra("p21",p21);
                    intent.putExtra("p22",p22);
                    intent.putExtra("p23",p23);
                    intent.putExtra("p24",p24);
                    startActivity(intent);
                }
            }
        });





        passto2.setText("Let "+p2name+" try");



        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1 = gesp21.getText().toString();
                String t2 = gesp22.getText().toString();
                String t3 = gesp23.getText().toString();
                String t4 = gesp24.getText().toString();

                if (p22.equals(t2)&&p21.equals(t1)&&p23.equals(t3)&&p24.equals(t4) ){

                    final MediaPlayer mp =MediaPlayer.create(FirstTry.this,R.raw.applause);
                    mp.start();
                    final MediaPlayer mp1 =MediaPlayer.create(FirstTry.this,R.raw.fireworks);
                    mp1.start();
                    MainActivity.player.stop();


                    final Button passto2 =findViewById(R.id.gop2);
                    passto2.setText("Congratulation "+p1name);
                    AlertDialog.Builder build = new AlertDialog.Builder(FirstTry.this);
                    View vu =LayoutInflater.from(FirstTry.this).inflate(R.layout.win,null);
                    build.setPositiveButton("Hey Loser , you have to", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(FirstTry.this , punish.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                                    | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                            mp.stop();
                            mp1.stop();
                        }
                    });
                    build.setNegativeButton("Forgive Loser", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(FirstTry.this , MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                                    | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(intent);
                            mp.stop();
                            mp1.stop();
                        }
                    });

                    AlertDialog alert =build.create();
                    alert.setView(vu);
                    alert.setTitle("Congratulation"+p1name);
                    alert.getWindow().setLayout(400,400);

                    alert.show();

                }
                else {


                    int tt=0;
                    int vv=0;

                    if (TextUtils.isEmpty(gesp21.getText().toString()) ||TextUtils.isEmpty(gesp22.getText().toString()) ||TextUtils.isEmpty(gesp23.getText().toString()) ||TextUtils.isEmpty(gesp24.getText().toString())  ){
                        Toast.makeText(FirstTry.this,"your try is minus",Toast.LENGTH_SHORT).show();
                        Toast.makeText(FirstTry.this,"You don't want to try",Toast.LENGTH_SHORT).show();
                    }
                    else {

                        final MediaPlayer mp2 =MediaPlayer.create(FirstTry.this,R.raw.wrong);
                        mp2.start();
                        //validation true number


                        if (p21.equals(t1)) {
                            tt++;
                        }

                        else if (p21.equals(t2) || p21.equals(t3) || p21.equals(t4)){

                                vv++;

                            }


                        //kjhwdfjkhf


                        if (p22.equals(t2)) {
                            tt++;
                        } else
                            if (p22.equals(t1) || p22.equals(t3) || p22.equals(t4)) {
                                vv++;

                            }


                        //kjhwdfjkhf
                        if (p23.equals(t3)) {
                            tt++;
                        } else
                            if (p23.equals(t2) || p23.equals(t1) || p23.equals(t4)) {
                                vv++;


                            }

                        //kjhwdfjkhf
                        if (p24.equals(t4)) {
                            tt++;
                        } else
                            if (p24.equals(t2) || p24.equals(t3) || p24.equals(t1)) {
                                vv++;



                        }

                    }
                    final TextView afich =findViewById(R.id.writename1);
                    afich.setText(tt+"T\n"+vv+"V");
            }

                }
        });



    }
}
