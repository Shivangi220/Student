package com.example.student;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class studentdetail extends AppCompatActivity {
    Button homtn,coursebtn,submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentdetail);
        homtn=findViewById(R.id.homebtn);
        coursebtn=findViewById(R.id.coursebtn);
        submitbtn=findViewById(R.id.submitbtn);
        homtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotohome=new Intent(studentdetail.this, homepage.class);
                startActivity(gotohome);
            }
        });
        coursebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent course=new Intent(studentdetail.this,com.example.student.course.class);
                startActivity(course);
            }
        });
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(studentdetail.this, "SUBMITTED......", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
