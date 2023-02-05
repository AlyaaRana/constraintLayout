package com.example.constraintrelative_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RelativeLayout extends AppCompatActivity {

    //list widget yg akan dikenakan aski
    EditText Name, Age,Comment;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        //connect komponen
        Name = (EditText)findViewById(R.id.inputName);
        Age = (EditText)findViewById(R.id.inputAge);
        Comment = (EditText)findViewById(R.id.inputComment);
        send = (Button) findViewById(R.id.send);
    }
}