package com.royal.calculator;

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

public class Addition extends AppCompatActivity {

    AppCompatButton b1,b2;
    EditText n1,n2,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);
        n1=(EditText)findViewById(R.id.num1);
        n2=(EditText)findViewById(R.id.num2);
        res=(EditText)findViewById(R.id.result);
        b1=(AppCompatButton)findViewById(R.id.add);
        b2=(AppCompatButton) findViewById(R.id.backToMenu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String getNum1 = n1.getText().toString();
                    String getNum2 = n2.getText().toString();
                    int a = Integer.parseInt(getNum1);
                    int b = Integer.parseInt(getNum2);
                    int sum = a + b;
                    Toast.makeText(getApplicationContext(), String.valueOf(sum), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e) {
                    Toast.makeText(getApplicationContext(),e.toString(), Toast.LENGTH_SHORT).show();
                }
            };
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}