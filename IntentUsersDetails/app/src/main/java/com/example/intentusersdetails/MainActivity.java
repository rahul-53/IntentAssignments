package com.example.intentusersdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEtFirstName;
    private EditText mEtLastName;
    private EditText mEtAge;
    private Button mBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
       mEtFirstName=findViewById(R.id.etFirstName);
        mEtLastName=findViewById(R.id.etLastName);
        mEtAge=findViewById(R.id.etAge);
        mBtnNext =findViewById(R.id.tvBtnNext);

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Details.class);
                intent.putExtra("firstName",mEtFirstName.getText().toString());
                intent.putExtra("lastName",mEtLastName.getText().toString());
                intent.putExtra("age",mEtAge.getText().toString());

                startActivity(intent);
            }
        });
    }

}