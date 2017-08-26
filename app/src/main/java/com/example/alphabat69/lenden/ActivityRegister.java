package com.example.alphabat69.lenden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ActivityRegister extends AppCompatActivity implements View.OnClickListener,View.OnFocusChangeListener{
    Button btn1;
    EditText tf1,tf2,tf3,tf4,tf5,tf6;int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;

    //DatabaseReference databaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //databaseUser= FirebaseDatabase.getInstance().getReference("user");

        btn1=(Button)findViewById(R.id.btn1);
        tf1=(EditText)findViewById(R.id.tf1);
        tf2=(EditText)findViewById(R.id.tf2);
        tf3=(EditText)findViewById(R.id.tf3);
        tf4=(EditText)findViewById(R.id.tf4);
        tf5=(EditText)findViewById(R.id.tf5);
        tf6=(EditText)findViewById(R.id.tf6);
        btn1.setOnClickListener(ActivityRegister.this);
        tf1.setOnFocusChangeListener(ActivityRegister.this);
        tf2.setOnFocusChangeListener(ActivityRegister.this);
        tf3.setOnFocusChangeListener(ActivityRegister.this);
        tf4.setOnFocusChangeListener(ActivityRegister.this);
        tf5.setOnFocusChangeListener(ActivityRegister.this);
        tf6.setOnFocusChangeListener(ActivityRegister.this);
    }
    @Override
    public void onClick(View view)
    {
        //addUser();

        Intent myIntent=new Intent(ActivityRegister.this,Activity2.class);
        ActivityRegister.this.startActivity(myIntent);
        finish();
    }
    /*public void addUser()
    {
        String id,name,institution,roll,phone,email;
        id=tf1.getText().toString();
        name=tf2.getText().toString();
        institution=tf3.getText().toString();
        roll=tf4.getText().toString();
        phone=tf5.getText().toString();
        email=tf6.getText().toString();
        User user=new User(id,name,institution,roll,phone,email);
        databaseUser.setValue(user);
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
