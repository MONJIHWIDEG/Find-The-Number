package com.example.asus.matchstick;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    public static MediaPlayer player;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CardView start =findViewById(R.id.start);
        final CardView options =findViewById(R.id.option);
        final CardView exit =findViewById(R.id.exit);


        player=MediaPlayer.create(MainActivity.this,R.raw.bg);
         player.setLooping(true);
         player.start();

        options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this , option.class);
                startActivity(intent);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Choice.class);
                startActivity(intent);
            }
        });


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  android.os.Process.killProcess( android.os.Process.myPid());
               // System.exit(1);

                  finish();
                  System.exit(0);


            }
        });
    }
}
