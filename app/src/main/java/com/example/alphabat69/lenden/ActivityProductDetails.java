package com.example.alphabat69.lenden;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityProductDetails extends AppCompatActivity implements View.OnClickListener,View.OnFocusChangeListener{
    Button btn1;
    EditText tf1;int f1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        btn1=(Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(ActivityProductDetails.this);
        tf1=(EditText)findViewById(R.id.tf1);
        tf1.setOnFocusChangeListener(ActivityProductDetails.this);
    }
    @Override
    public void onClick(View view)
    {
        String id=tf1.getText().toString();
    }
    @Override
    public void onFocusChange(View view,boolean b)
    {
        switch(view.getId()) {
            case R.id.tf1: {
                if (b)
                    if (f1 == 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                        tf1.setText("");
                        f1 = 1;
                    }
                break;
            }
        }
    }
}
