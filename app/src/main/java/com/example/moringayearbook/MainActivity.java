package com.example.moringayearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mFindCourseButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFindCourseButton = (Button) findViewById(R.id.findCoursesButton);
        mFindCourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //                Toast.makeText(MainActivity.this, "HelloWorld!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, CoursesActivity.class);
                startActivity(intent);
            }
        });
        }
}
