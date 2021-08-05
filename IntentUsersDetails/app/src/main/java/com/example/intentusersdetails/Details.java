package com.example.intentusersdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    private TextView mTvFirstName;
    private TextView mTvLastName;
    private TextView mTvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initView();
        getIntentDetails();

    }
    public void getIntentDetails(){
        Intent intent= getIntent();
        String firstName =intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String age = intent.getStringExtra("age");
        mTvFirstName.setText(firstName);
        mTvLastName.setText(lastName);
        mTvAge.setText(age);
    }


    public void initView(){
        mTvFirstName=findViewById(R.id.tvFirstName);
        mTvLastName=findViewById(R.id.tvLastName);
        mTvAge = findViewById(R.id.tvAge);
    }
}