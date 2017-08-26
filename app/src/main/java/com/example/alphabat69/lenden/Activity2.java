package com.example.alphabat69.lenden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2;TextView tf1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        tf1=(TextView)findViewById(R.id.tf1);
        btn1.setOnClickListener(Activity2.this);
        btn2.setOnClickListener(Activity2.this);
        tf1.setText("Hi, "+User.ID);
    }
    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.btn1:
            {
                Intent myIntent=new Intent(Activity2.this,ActivityBuy.class);
                Activity2.this.startActivity(myIntent);
                break;
            }
            case R.id.btn2:
            {
                Intent myIntent=new Intent(Activity2.this,ActivitySell.class);
                Activity2.this.startActivity(myIntent);
                break;
            }
        }
    }
}
