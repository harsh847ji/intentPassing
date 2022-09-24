package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        getSupportActionBar().hide();
        TextView name2;
        TextView cls2;
        TextView rollno2;
        name2 = findViewById(R.id.name2);
        cls2 = findViewById(R.id.cls2);
        rollno2 = findViewById(R.id.rollno2);

        Intent fromAct = getIntent();
        String names = fromAct.getStringExtra("name");
        String clas = fromAct.getStringExtra("clas");
        String roll = fromAct.getStringExtra("roll");

        name2.setText(names);
        cls2.setText(clas);
        rollno2.setText(roll);
    }
}