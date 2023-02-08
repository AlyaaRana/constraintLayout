package com.example.constraintrelative_layout;

import static com.example.constraintrelative_layout.R.id.hasil;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    public TextView outputName, outputAge,outputComment;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputName = findViewById(R.id.outputName);
        outputAge = findViewById(R.id.outputAge);
        outputComment = findViewById(R.id.outputComent);
    }
    @Override
    protected void onStart(){
        super.onStart();
        intent = getIntent();
        outputName.setText("Nama : "+intent.getStringExtra("Name"));
        outputAge.setText("Nama : "+intent.getStringExtra("Age"));
        outputComment.setText("Nama : "+intent.getStringExtra("Comment"));
    }
}