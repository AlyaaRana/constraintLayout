package com.example.constraintrelative_layout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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
        usn = (EditText) findViewById(R.id.txtUsername);
        pw = (EditText) findViewById(R.id.txtPassword);
        send = (Button) findViewById(R.id.btnLogin);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usn.getText().toString();
                String password = pw.getText().toString();
                if(username.equalsIgnoreCase("admin") &&
                        password.equalsIgnoreCase("admin")){
                    Toast.makeText(getApplicationContext(),"login sukses", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(ConstraintLayout.this, RelativeLayout.class));
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(),"gagal login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}