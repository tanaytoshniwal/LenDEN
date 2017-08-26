package com.example.alphabat69.lenden;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivitySell extends AppCompatActivity implements View.OnClickListener,View.OnFocusChangeListener{
    EditText tf1,tf2,tf3,tf4,tf5,tf6;
    int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;
    //DatabaseReference databaseUser;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);
        tf1=(EditText)findViewById(R.id.tf1);
        tf2=(EditText)findViewById(R.id.tf2);

        //databaseUser= FirebaseDatabase.getInstance().getReference("product");

        tf3=(EditText)findViewById(R.id.tf3);
        tf4=(EditText)findViewById(R.id.tf4);
        tf5=(EditText)findViewById(R.id.tf5);
        tf6=(EditText)findViewById(R.id.tf6);
        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(ActivitySell.this);
        tf1.setOnFocusChangeListener(ActivitySell.this);
        tf2.setOnFocusChangeListener(ActivitySell.this);
        tf3.setOnFocusChangeListener(ActivitySell.this);
        tf4.setOnFocusChangeListener(ActivitySell.this);
        tf5.setOnFocusChangeListener(ActivitySell.this);
        tf6.setOnFocusChangeListener(ActivitySell.this);
    }
    @Override
    public void onClick(View view)
    {
        //addProduct();
        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder(ActivitySell.this).setTitle("DataSaved!").setMessage("Do You Wish To Continue Exploring!")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent myIntent=new Intent(ActivitySell.this,Activity2.class);
                        ActivitySell.this.startActivity(myIntent);
                        finish();
                    }
                })
        .setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);
            }
        });
        builder.show();
    }
    /*public void addProduct()
    {
        String id,name,detail,condition,price,number;
        id=tf1.getText().toString();
        name=tf2.getText().toString();
        detail=tf3.getText().toString();
        condition=tf4.getText().toString();
        price=tf5.getText().toString();
        number=tf6.getText().toString();
        Product product=new Product(id,name,detail,condition,price,number);
        databaseUser.setValue(product);
    }*/
    @Override
    public void onFocusChange(View view,boolean b)
    {
        switch(view.getId())
        {
            case R.id.tf1:
            {
                if(b)
                    if(f1==0) {
                        try
                        {Thread.sleep(1000);}
                        catch(InterruptedException e)
                        {}
                        tf1.setText("");
                        f1 = 1;
                    }
                break;
            }
            case R.id.tf2:
            {
                if(b)
                    if(f2==0) {
                        tf2.setText("");
                        f2 = 1;
                    }
                break;
            }
            case R.id.tf3:
            {
                if(b)
                    if(f3==0) {
                        tf3.setText("");
                        f3 = 1;
                    }
                break;
            }
            case R.id.tf4:
            {
                if(b)
                    if(f4==0) {
                        tf4.setText("");
                        f4 = 1;
                    }
                break;
            }
            case R.id.tf5:
            {
                if(b)
                    if(f5==0) {
                        tf5.setText("");
                        f5 = 1;
                    }
                break;
            }
            case R.id.tf6:
            {
                if(b)
                    if(f6==0) {
                        tf6.setText("");
                        f6 = 1;
                    }
                break;
            }
        }
    }
}
