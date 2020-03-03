package com.example.softwaretestingbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Chap1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Chap1=findViewById(R.id.Ch1);

       Chap1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent=new Intent(MainActivity.this,chap1Activity.class);
        startActivity(intent);
    }
}
