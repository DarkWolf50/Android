package com.example.assignment1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt_msg;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_msg=(EditText) findViewById(R.id.txt_msg);
        btn=(Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=txt_msg.getText().toString();
                Intent intent=new Intent(MainActivity.this,SecondActivity1_2.class);
                intent.putExtra("msg",str);
                startActivity(intent);
            }
        });
    }
}