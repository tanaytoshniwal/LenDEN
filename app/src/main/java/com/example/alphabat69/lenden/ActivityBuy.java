package com.example.alphabat69.lenden;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ActivityBuy extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2;
    String TAG="ActivityBuy";
    FirebaseDatabase fdatabase;
    FirebaseAuth fauth;
    FirebaseAuth.AuthStateListener fauthlistener;
    DatabaseReference myRef;
    String id;
    ListView lv1;
    //ListView listViewProduct;
    //List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn1.setOnClickListener(ActivityBuy.this);
        lv1=(ListView)findViewById(R.id.lv1);
        //fauth=FirebaseAuth.getInstance();
        //fdatabase=FirebaseDatabase.getInstance();
        //myRef=fdatabase.getReference();
        //FirebaseUser user=fauth.getCurrentUser();
        //d=user.getUid();

        /*listViewProduct=(ListView)findViewById(R.id.listView);
        productList=new ArrayList<>();
        databaseProduct= FirebaseDatabase.getInstance().getReference("product");*/

        btn2.setOnClickListener(ActivityBuy.this);
        /*fauthlistener=new FirebaseAuth.AuthStateListener()
        {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user=firebaseAuth.getCurrentUser();
                if(user!=null)
                {
                    Log.d(TAG,"onAuthChanged:signed_in:"+user.getUid());

                }
                else
                {
                    Log.d(TAG,"onAuthChanged:signed_out:");
                }
            }
        };*/
        /*myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                showData(dataSnapshot);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/
    }
    /*public void showData(DataSnapshot dataSnapshot)
    {
        for(DataSnapshot ds:dataSnapshot.getChildren())
        {
            Product product=new Product();
            product.setId(ds.child(id).getValue(Product.class).getId());
            product.setDetail(ds.child(id).getValue(Product.class).getDetail());
            product.setCondition(ds.child(id).getValue(Product.class).getCondition());
            product.setName(ds.child(id).getValue(Product.class).getName());
            product.setNumber(ds.child(id).getValue(Product.class).getNumber());
            product.setPrice(ds.child(id).getValue(Product.class).getPrice());

            Log.d(TAG,"showData: id:"+product.getId());
            Log.d(TAG,"showData: detail:"+product.getDetail());
            Log.d(TAG,"showData: condition:"+product.getCondition());
            Log.d(TAG,"showData: name:"+product.getName());
            Log.d(TAG,"showData: number:"+product.getNumber());
            Log.d(TAG,"showData: price:"+product.getPrice());

            ArrayList<String> arrayList=new ArrayList<String>();

            ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1);
            lv1.setAdapter(adapter);
        }
    }*/
    @Override
    protected void onStart() {
        super.onStart();
        //fauth.addAuthStateListener(fauthlistener);
    }
/*
    @Override
    protected void onStop() {
        super.onStop();
        if(fauthlistener!=null)
            fauth.removeAuthStateListener(fauthlistener);
    }
    /*@Override
    protected void onStart() {
        super.onStart();
        databaseProduct.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                productList.clear();
                for(DataSnapshot productSnapshot:dataSnapshot.getChildren())
                {
                    Product product=productSnapshot.getValue(Product.class);
                    productList.add(product);
                }
                ProductList adapter=new ProductList(ActivityBuy.this,productList);
                listViewProduct.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }*/

    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.btn1:
            {

                break;
            }
            case R.id.btn2:
            {
                Intent myIntent=new Intent(ActivityBuy.this,ActivityProductDetails.class);
                ActivityBuy.this.startActivity(myIntent);

                break;
            }
        }
    }
}
