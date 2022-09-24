package com.example.intentpassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button button;
        EditText name;
        EditText cls;
        EditText rollno;
        name = findViewById(R.id.name);
        cls = findViewById(R.id.cls);
        rollno = findViewById(R.id.rollno);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent next = new Intent(MainActivity.this,SecondActivity2.class);
                next.putExtra("name",name.getText().toString());
                next.putExtra("clas",cls.getText().toString());
                next.putExtra("roll",rollno.getText().toString());



                startActivity(next);
            }
        });
    }
}