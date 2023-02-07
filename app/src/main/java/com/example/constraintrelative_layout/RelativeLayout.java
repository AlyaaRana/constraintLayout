package com.example.constraintrelative_layout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class RelativeLayout extends AppCompatActivity {

    //list widget yg akan dikenakan aski
    EditText Name, Age,Comment;
    Button send;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Form");

        //connect komponen
        Name = (EditText)findViewById(R.id.inputName);
        Age = (EditText)findViewById(R.id.inputAge);
        Comment = (EditText)findViewById(R.id.inputComment);
        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String age = Age.getText().toString();
                String comment = Comment.getText().toString();
                Intent intent = new Intent(RelativeLayout.this,MainActivity.class);
                intent.putExtra("NAME", String.valueOf(Name));
                intent.putExtra("AGE", String.valueOf(Age));
                intent.putExtra("COMMENT", String.valueOf(Comment));
                startActivity(intent);
            }
        });
    }
}