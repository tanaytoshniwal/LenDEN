package com.example.alphabat69.lenden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.sql.*;

public class ActivityLogin extends AppCompatActivity implements View.OnClickListener,View.OnFocusChangeListener{
    Button login,signup;
    EditText email,pwd;int f=0,f1=0;
    Connection con;
    String un,db,pass,ip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button)findViewById(R.id.login);
        signup=(Button)findViewById(R.id.signup);
        email=(EditText)findViewById(R.id.email);
        pwd=(EditText)findViewById(R.id.pwd);
        email.setOnFocusChangeListener(ActivityLogin.this);
        pwd.setOnFocusChangeListener(ActivityLogin.this);
        login.setOnClickListener(ActivityLogin.this);
        signup.setOnClickListener(ActivityLogin.this);
    }
    @Override
    public void onFocusChange(View view,boolean b)
    {
        switch(view.getId())
        {
            case R.id.email:
            {
                if(b)
                    if(f==0) {
                        try
                        {Thread.sleep(1000);}
                        catch(InterruptedException e)
                        {}
                        email.setText("");
                        f = 1;
                    }
                break;
            }
            case R.id.pwd:
            {
                if(b)
                    if(f1==0) {
                        pwd.setText("");
                        f1 = 1;
                    }
                break;
            }
        }
    }
    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.login:
            {
                Intent myIntent=new Intent(ActivityLogin.this,Activity2.class);
                ActivityLogin.this.startActivity(myIntent);
                finish();
                break;
            }
            case R.id.signup:
            {

                Intent myIntent=new Intent(ActivityLogin.this,ActivityRegister.class);
                ActivityLogin.this.startActivity(myIntent);
                break;
            }
        }
    }
}
