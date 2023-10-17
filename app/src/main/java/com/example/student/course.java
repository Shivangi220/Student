package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class course extends AppCompatActivity {
    Button Logout;
    Button homebtn;
    Button Stdbtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);
        Button Logout,homebtn,Stdbtn;
        homebtn=findViewById(R.id.kl);
        Stdbtn=findViewById(R.id.ik);
        Logout=findViewById(R.id.btnlog);
        Intent logt;
        logt = new Intent(course.this, MainActivity.class);
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(logt);
            }
        });
        Intent hm;
        hm= new Intent(course.this, homepage.class);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(hm);
            }
        });
        Intent std;
        std=new Intent(course.this, studentdetail.class);
        Stdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(std);
            }
        });

    }
}
