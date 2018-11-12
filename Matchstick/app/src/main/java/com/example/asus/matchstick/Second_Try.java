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

public class Second_Try extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__try);


        final EditText gesp11 = findViewById(R.id.gesp11);
        final EditText gesp12 = findViewById(R.id.gesp12);
        final EditText gesp13 = findViewById(R.id.gesp13);
        final EditText gesp14 = findViewById(R.id.gesp14);

        final Button back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Try.this, Choice.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });


        final Button passto2 = findViewById(R.id.gop1);
        Button check = findViewById(R.id.check2);

        Intent int1 = getIntent();
        final String p11 = int1.getStringExtra("p11");
        Intent int5 = getIntent();
        final String p1name = int1.getStringExtra("p1name");
        Intent int10 = getIntent();
        final String p2name = int1.getStringExtra("p2name");
        Intent int2 = getIntent();
        final String p12 = int2.getStringExtra("p12");
        Intent int3 = getIntent();
        final String p13 = int3.getStringExtra("p13");
        Intent int4 = getIntent();
        final String p14 = int4.getStringExtra("p14");


        Intent int11 = getIntent();
        final String p21 = int1.getStringExtra("p21");
        Intent int21 = getIntent();
        final String p22 = int2.getStringExtra("p22");
        Intent int31 = getIntent();
        final String p23 = int3.getStringExtra("p23");
        Intent int41 = getIntent();
        final String p24 = int4.getStringExtra("p24");




        passto2.setText("Let " + p1name + " try");
        final TextView afich =findViewById(R.id.writename);
        afich.setText(p2name);


        passto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(gesp11.getText().toString()) ||TextUtils.isEmpty(gesp12.getText().toString()) ||TextUtils.isEmpty(gesp13.getText().toString()) ||TextUtils.isEmpty(gesp14.getText().toString())  ){
                    Toast.makeText(Second_Try.this,"your try is minus",Toast.LENGTH_SHORT).show();
                    Toast.makeText(Second_Try.this,"You don't want to try",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(Second_Try.this , FirstTry.class);
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


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1 = gesp11.getText().toString();
                String t2 = gesp12.getText().toString();
                String t3 = gesp13.getText().toString();
                String t4 = gesp14.getText().toString();


                if (p12.equals(t2)&&p11.equals(t1)&&p13.equals(t3)&&p14.equals(t4) ){
                    final MediaPlayer mp =MediaPlayer.create(Second_Try.this,R.raw.applause);
                    mp.start();
                    final MediaPlayer mp1 =MediaPlayer.create(Second_Try.this,R.raw.fireworks);
                    mp1.start();
                    MainActivity.player.stop();


                    final Button passto1 =findViewById(R.id.gop1);
                    passto1.setText("Congratulation "+p2name);
                    final AlertDialog.Builder build = new AlertDialog.Builder(Second_Try.this);
                    View vu =LayoutInflater.from(Second_Try.this).inflate(R.layout.win,null);
                    build.setPositiveButton("Hey Loser , you have to", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Second_Try.this , punish.class);
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
                            Intent intent = new Intent(Second_Try.this , MainActivity.class);
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
                    final MediaPlayer mp2 =MediaPlayer.create(Second_Try.this,R.raw.wrong);
                    mp2.start();

                    int tt=0;
                    int vv=0;

                //validation true number
                if (p11.equals(t1)) {
                    tt++;
                } else {
                    if (p11.equals(t2) || p11.equals(t3) || p11.equals(t4)) {
                        vv++;

                    }

                }
                //kjhwdfjkhf
                if (p12.equals(t2)) {
                    tt++;
                } else {
                    if (p12.equals(t1) || p12.equals(t3) || p12.equals(t4)) {
                        vv++;

                    }

                }
                //kjhwdfjkhf
                if (p13.equals(t3)) {
                    tt++;
                } else {
                    if (p13.equals(t2) || p13.equals(t1) || p13.equals(t4)) {
                        vv++;

                    }
                }
                //kjhwdfjkhf
                if (p14.equals(t4)) {
                    tt++;
                } else {
                    if (p14.equals(t2) || p14.equals(t3) || p14.equals(t1)) {
                        vv++;


                    }
                }
                    final TextView afich =findViewById(R.id.writename);
                    afich.setText(tt+"T\n"+vv+"V");
            }

            }
        });


    }
}
