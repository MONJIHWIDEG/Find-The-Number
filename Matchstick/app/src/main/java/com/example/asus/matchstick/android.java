package com.example.asus.matchstick;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class android extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        final EditText try1 =findViewById(R.id.and1);
        final EditText try2 =findViewById(R.id.and2);
        final EditText try3 =findViewById(R.id.and3);
        final EditText try4 =findViewById(R.id.and4);
        final TextView name =findViewById(R.id.usern);
        final ImageView test=findViewById(R.id.usertry);
        final TextView and1 =findViewById(R.id.user1);
        final TextView and2 =findViewById(R.id.user2);
        final TextView and3 =findViewById(R.id.user3);
        final TextView and4 =findViewById(R.id.user4);
        final ImageView test2=findViewById(R.id.andtry);
        final TextView andres =findViewById(R.id.android_resultat);
        final Button back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.this, Choice.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });





        Intent int7 = getIntent();
        final String p1 = int7.getStringExtra("p1");
        Intent int8 = getIntent();
        final String username = int8.getStringExtra("name");
        Intent int9 = getIntent();
        final String p2 = int9.getStringExtra("p2");
        Intent int11 = getIntent();
        final String p3 = int11.getStringExtra("p3");
        Intent int1 = getIntent();
        final String p4 = int1.getStringExtra("p4");


        final CardView card2=findViewById(R.id.android);
        final CardView card1=findViewById(R.id.user);
        final  Random rn = new Random();

            int num_android1 = rn.nextInt(9) + 1;
            int num_android2 = rn.nextInt(9) + 1;
            int num_android3 = rn.nextInt(9) + 1;
            int num_android4 = rn.nextInt(9) + 1;
       while (num_android1==num_android2||num_android1==num_android3||num_android1==num_android4||num_android3==num_android2||num_android3==num_android4||num_android4==num_android2){
           num_android1 = rn.nextInt(9) + 1;
            num_android2 = rn.nextInt(9) + 1;
          num_android3 = rn.nextInt(9) + 1;
           num_android4 = rn.nextInt(9) + 1;
       }
        final Integer usertry1=Integer.parseInt(p1);
        final Integer usertry2=Integer.parseInt(p2);
        final Integer usertry3=Integer.parseInt(p3);
        final Integer usertry4=Integer.parseInt(p4);


        name.setText(username);
        final int finalNum_android = num_android1;
        final int finalNum_android1 = num_android2;
        final int finalNum_android2 = num_android3;
        final int finalNum_android3 = num_android4;



        final ImageView n0=findViewById(R.id.n0);
        final ImageView n1=findViewById(R.id.n1);
        final ImageView n2=findViewById(R.id.n2);
        final ImageView n3=findViewById(R.id.n3);
        final ImageView n4=findViewById(R.id.n4);
        final ImageView n5=findViewById(R.id.n5);
        final ImageView n6=findViewById(R.id.n6);
        final ImageView n7=findViewById(R.id.n7);
        final ImageView n8=findViewById(R.id.n8);
        final ImageView n9=findViewById(R.id.n9);

        final ImageView nn0=findViewById(R.id.nn0);
        final ImageView nn1=findViewById(R.id.nn1);
        final ImageView nn2=findViewById(R.id.nn2);
        final ImageView nn3=findViewById(R.id.nn3);
        final ImageView nn4=findViewById(R.id.nn4);
        final ImageView nn5=findViewById(R.id.nn5);
        final ImageView nn6=findViewById(R.id.nn6);
        final ImageView nn7=findViewById(R.id.nn7);
        final ImageView nn8=findViewById(R.id.nn8);
        final ImageView nn9=findViewById(R.id.nn9);

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nn0.setVisibility(nn0.VISIBLE);
                n0.setVisibility(n0.INVISIBLE);



            }
        });
       n1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nn1.setVisibility(nn1.VISIBLE);
               n1.setVisibility(n1.INVISIBLE);

           }
       });
       n2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nn2.setVisibility(nn2.VISIBLE);
               n2.setVisibility(n2.INVISIBLE);

           }
       });
       n3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nn3.setVisibility(nn3.VISIBLE);
               n3.setVisibility(n3.INVISIBLE);

           }
       });
       n4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nn4.setVisibility(nn4.VISIBLE);
               n4.setVisibility(n4.INVISIBLE);

           }
       });
       n5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nn5.setVisibility(nn5.VISIBLE);
               n5.setVisibility(n5.INVISIBLE);

           }
       });
       n6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nn6.setVisibility(nn6.VISIBLE);
               n6.setVisibility(n6.INVISIBLE);

           }
       });
       n7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nn7.setVisibility(nn7.VISIBLE);
               n7.setVisibility(n7.INVISIBLE);

           }
       });
       n8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nn8.setVisibility(nn8.VISIBLE);
               n8.setVisibility(n8.INVISIBLE);

           }
       });
       n9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nn9.setVisibility(nn9.VISIBLE);
               n9.setVisibility(n9.INVISIBLE);

           }
       });
       nn0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n0.setVisibility(n0.VISIBLE);
               nn0.setVisibility(nn0.INVISIBLE);

           }
       });
       nn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n1.setVisibility(n1.VISIBLE);
               nn1.setVisibility(nn1.INVISIBLE);
           }
       });
       nn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n2.setVisibility(n2.VISIBLE);
               nn2.setVisibility(nn2.INVISIBLE);
           }
       });
       nn3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n3.setVisibility(n3.VISIBLE);
               nn3.setVisibility(nn3.INVISIBLE);
           }
       });
       nn4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n4.setVisibility(n4.VISIBLE);
               nn4.setVisibility(nn4.INVISIBLE);
           }
       });
       nn5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n5.setVisibility(n5.VISIBLE);
               nn5.setVisibility(nn5.INVISIBLE);
           }
       });
       nn6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n6.setVisibility(n6.VISIBLE);
               nn6.setVisibility(nn6.INVISIBLE);
           }
       });
       nn7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n7.setVisibility(n7.VISIBLE);
               nn7.setVisibility(nn7.INVISIBLE);
           }
       });
       nn8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n8.setVisibility(n8.VISIBLE);
               nn8.setVisibility(nn8.INVISIBLE);

           }
       });
       nn9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               n9.setVisibility(n9.VISIBLE);
               nn9.setVisibility(nn9.INVISIBLE);
           }
       });



        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (!(TextUtils.isEmpty(try1.getText().toString()))&&!(TextUtils.isEmpty(try2.getText().toString()))&&
                        !(TextUtils.isEmpty(try3.getText().toString()))&&!(TextUtils.isEmpty(try4.getText().toString()))){

                    final int us1=Integer.parseInt(try1.getText().toString());
                    final int us2=Integer.parseInt(try2.getText().toString());
                    final int us3=Integer.parseInt(try3.getText().toString());
                    final int us4=Integer.parseInt(try4.getText().toString());


                    final Integer n1=Integer.parseInt(try1.getText().toString());
                    final Integer n2=Integer.parseInt(try2.getText().toString());
                    final Integer n3=Integer.parseInt(try3.getText().toString());
                    final Integer n4=Integer.parseInt(try4.getText().toString());

                    int tt=0;
                    int vvv=0;

                    if (us1== finalNum_android){
                        tt++;
                    } if (us2== finalNum_android1){
                        tt++;
                    } if (us3== finalNum_android2){
                        tt++;
                    } if (us4== finalNum_android3){
                        tt++;
                    }
                    if (us1== finalNum_android1 ||us1== finalNum_android2 ||us1== finalNum_android3){
                        vvv++;
                    } if (us2== finalNum_android ||us2== finalNum_android2 ||us2== finalNum_android3){
                        vvv++;
                    } if (us3== finalNum_android1 ||us3== finalNum_android ||us3== finalNum_android3){
                        vvv++;
                    } if (us4== finalNum_android1 ||us4== finalNum_android2 ||us4== finalNum_android){
                        vvv++;
                    }


                    if(n1==n2||n1==n3||n1==n4||n2==n3||n2==n4||n3==n4){
                        Toast.makeText(android.this,"There is a repeated number in the answer",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if (tt==4) {


                            final MediaPlayer mp = MediaPlayer.create(android.this, R.raw.applause);
                            mp.start();
                            final MediaPlayer mp1 = MediaPlayer.create(android.this, R.raw.fireworks);
                            mp1.start();
                            MainActivity.player.stop();


                            AlertDialog.Builder build = new AlertDialog.Builder(android.this);
                            View vu = LayoutInflater.from(android.this).inflate(R.layout.win, null);
                            build.setNegativeButton("Home", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(android.this, MainActivity.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                                            | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                    startActivity(intent);
                                    mp.stop();
                                    mp1.stop();
                                }
                            });

                            AlertDialog alert = build.create();
                            alert.setView(vu);
                            alert.setTitle("Congratulation " + username);
                            alert.getWindow().setLayout(400, 400);

                            alert.show();


                        }

                        else {


                        //afficher le resultat de user try
                        AlertDialog.Builder buildd = new AlertDialog.Builder(android.this);

                        buildd.setNegativeButton("Let Android try", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        });

                        AlertDialog alertt =buildd.create();
                        alertt.setTitle(tt+"T"+vvv+"V");
                        alertt.setMessage("Your answer is not correct");
                        alertt.getWindow().setLayout(400,400);

                        alertt.show();




                        card2.setVisibility(card2.VISIBLE);
                            card1.setVisibility(card1.GONE);

                        int c1=rn.nextInt(9)+1;
                        int c2=rn.nextInt(9)+1;
                        int c3=rn.nextInt(9)+1;
                        int c4=rn.nextInt(9)+1;
                        and1.setText(""+c1);
                        and2.setText(""+c2);
                        and3.setText(""+c3);
                        and4.setText(""+c4);

                        try1.setText("");
                        try2.setText("");
                        try3.setText("");
                        try4.setText("");
                        int t=0;
                        int vv=0;

                        if(c1==usertry1){
                            t++;
                        }  if(c2==usertry2){
                            t++;
                        }  if(c3==usertry3){
                            t++;
                        }  if(c4==usertry4){
                            t++;
                        }
                        if(c1==usertry2||c1==usertry3||c1==usertry4){
                            vv++;
                        } if(c2==usertry1||c2==usertry3||c2==usertry4){
                            vv++;
                        } if(c3==usertry2||c3==usertry1||c3==usertry4){
                            vv++;
                        } if(c4==usertry2||c4==usertry3||c4==usertry1){
                            vv++;
                        }

                        andres.setText(t+"T"+vv+"V");
                        Toast.makeText(android.this,"Passe To your tern",Toast.LENGTH_SHORT).show();
                        if(t==4){

                            AlertDialog.Builder build = new AlertDialog.Builder(android.this);
                            View vu =LayoutInflater.from(android.this).inflate(R.layout.win,null);

                            build.setNegativeButton("Forgive Loser", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(android.this , MainActivity.class);
                                    startActivity(intent);

                                }
                            });

                            AlertDialog alert =build.create();
                            alert.setView(vu);
                            alert.setTitle("Loser ! Android Win this time");
                            alert.getWindow().setLayout(400,400);

                            alert.show();
                        }}
                    }
                }

                else {
                    Toast.makeText(android.this,"You don't want to try !",Toast.LENGTH_SHORT).show();

                }
            }
        });


        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                card1.setVisibility(card1.VISIBLE);
                card2.setVisibility(card2.GONE);

            }
        });
    }
}
