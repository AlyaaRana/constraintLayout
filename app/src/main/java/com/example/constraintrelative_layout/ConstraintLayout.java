package com.example.constraintrelative_layout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ConstraintLayout extends AppCompatActivity {

    //list widget yg dikenakan aksi
    TextView usn;
    TextView pw;
    Button send;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        //connect
        usn = (TextView) findViewById(R.id.txtUsername);
        pw = (TextView) findViewById(R.id.txtPassword);
        send = (Button) findViewById(R.id.btnLogin);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usn.equals("alyaa") && (pw.equals("shinta"))
                ) {
                    startActivity(new Intent(ConstraintLayout.this, RelativeLayout.class));
                } else {
                    Toast.makeText(getApplicationContext(),"ups, username atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}