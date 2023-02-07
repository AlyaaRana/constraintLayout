package com.example.constraintrelative_layout;

import static com.example.constraintrelative_layout.R.id.hasil;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Hasil");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String age = intent.getStringExtra("AGE");
        String comment = intent.getStringExtra("COMMENT");
        TextView hasil = findViewById(R.id.hasil);
        hasil.setText("Nama anda adalah "+name+"\nUmur anda adalah "+age+"\nAnd, u'r comment ... "+comment);
    }
}