package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SmallestNumber extends AppCompatActivity {

    EditText num1,num2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_smallest_number);
        num1=(EditText) findViewById(R.id.num1);
        num2=(EditText) findViewById(R.id.num2);
        b1=(AppCompatButton) findViewById(R.id.menu);
        b2=(AppCompatButton) findViewById(R.id.find);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=num1.getText().toString();
                String n2=num2.getText().toString();
                int no1=Integer.parseInt(n1);
                int no2=Integer.parseInt(n2);
                if (no1>no2)    {
                    Toast.makeText(getApplicationContext(),String.valueOf(no2),Toast.LENGTH_SHORT).show();
                }
                else if(no1<no2)    {
                    Toast.makeText(getApplicationContext(),String.valueOf(no1),Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Equal",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}