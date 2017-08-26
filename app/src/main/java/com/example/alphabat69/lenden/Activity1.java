package com.example.alphabat69.lenden;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Activity1 extends AppCompatActivity {
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent myIntent=new Intent(Activity1.this,ActivityLogin.class);
                /*try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {

                }*/
                Activity1.this.startActivity(myIntent);
                finish();
            }
        },1000);
    }
}
