package com.example.moringayearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CoursesActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        listView = (ListView) findViewById(R.id.ListView);

        final String[] strArr = new String[]{
                "Shadrack",
                "Mark",
                "Mburia",
                "Justus",
                "Hamerton",
                "Philip",
                "Kamala",
                "Omonche",
                "Joel",
                "Nheru"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1, strArr);
    }
}
