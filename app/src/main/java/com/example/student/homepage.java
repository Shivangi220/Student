package com.example.student;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class homepage extends AppCompatActivity {
    Button studentbtn;
    Button coursebtn;
    Button lgbtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Button studentbtn,coursebtn,lgbtn;
        studentbtn = findViewById(R.id.button5);
        coursebtn=findViewById(R.id.button6);
        lgbtn=findViewById(R.id.button7);
        Intent stddetail,cd,lg;
        stddetail=new Intent(homepage.this, studentdetail.class);
        studentbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(stddetail);
            }
        });
        cd=new Intent(homepage.this, course.class);

        coursebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(cd);

            }
        });
        Intent logt;
        logt = new Intent(homepage.this, MainActivity.class);
        lgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(logt);
            }
        });

    }
}
