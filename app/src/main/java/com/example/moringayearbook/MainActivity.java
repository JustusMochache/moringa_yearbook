package com.example.moringayearbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mFindCourseButton;
    @BindView(R.id.user_1) CardView user_card_one;
    @BindView(R.id.user_2) CardView user_card_two;
    @BindView(R.id.user_3) CardView user_card_three;
    @BindView(R.id.user_4) CardView user_card_four;
    @BindView(R.id.user_5) CardView user_card_five;
    @BindView(R.id.user_6) CardView user_card_six;
    @BindView(R.id.user_7) CardView user_card_seven;
    @BindView(R.id.user_8) CardView user_card_eight;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        user_card_one.setOnClickListener(this);
        user_card_two.setOnClickListener(this);
        user_card_three.setOnClickListener(this);
        user_card_four.setOnClickListener(this);
        user_card_five.setOnClickListener(this);
        user_card_six.setOnClickListener(this);
        user_card_seven.setOnClickListener(this);
        user_card_eight.setOnClickListener(this);



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

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.user_1:
                Toast.makeText(this, "Card one clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, CoursesActivity.class);
                startActivity(intent);
                break;
            case R.id.user_2:
                Toast.makeText(this, "Card two clicked", Toast.LENGTH_SHORT).show();
                Intent intent2 =new Intent( MainActivity.this, CoursesActivity.class);
                startActivity(intent2);
                break;

            case R.id.user_3:
                Toast.makeText(this, "Card three clicked", Toast.LENGTH_SHORT).show();
                Intent intent3 =new Intent(MainActivity.this, CoursesActivity.class);
                startActivity(intent3);
                break;
            case R.id.user_4:
                Toast.makeText(this, "Card four clicked", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(MainActivity.this, CoursesActivity.class);
                startActivity(intent4);
                break;
            case R.id.user_5:
                Toast.makeText(this, "Card five clicked", Toast.LENGTH_SHORT).show();
                Intent intent5 =new Intent( MainActivity.this, CoursesActivity.class);
                startActivity(intent5);
                break;
            case R.id.user_6:
                Toast.makeText(this, "Card six clicked", Toast.LENGTH_SHORT).show();
                Intent intent6 =new Intent(MainActivity.this, CoursesActivity.class);
                startActivity(intent6);
                break;
            case R.id.user_7:
                Toast.makeText(this, "Card seven clicked", Toast.LENGTH_SHORT).show();
                Intent intent7 =new Intent( MainActivity.this, CoursesActivity.class);
                startActivity(intent7);
                break;
            case R.id.user_8:
                Toast.makeText(this, "Card eight clicked", Toast.LENGTH_SHORT).show();
                Intent intent8 =new Intent(MainActivity.this, CoursesActivity.class);
                startActivity(intent8);
                break;


        }
    }
}
