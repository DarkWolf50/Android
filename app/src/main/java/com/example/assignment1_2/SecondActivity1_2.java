package com.example.assignment1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity1_2 extends AppCompatActivity {
TextView txt_msgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second12);
        txt_msgview=(TextView) findViewById(R.id.txt_msg_answer);
        Intent intent=getIntent();
        String str=intent.getStringExtra("msg");
        txt_msgview.setText(str);
    }
}