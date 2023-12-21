package com.re.servicemediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play=findViewById(R.id.playbtn);
        play.setOnClickListener(this);

        stop=findViewById(R.id.stopbtn);
        stop.setOnClickListener(this);
    }
    public void onClick(View view){
        if(view == play){
            startService(new Intent(this,MyService.class));
        }
        else if(view == stop){
            stopService(new Intent(this,MyService.class));
        }
    }
}