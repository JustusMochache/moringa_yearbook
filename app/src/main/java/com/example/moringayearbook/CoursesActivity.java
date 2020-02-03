package com.example.moringayearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class CoursesActivity extends AppCompatActivity {

    private Button mFindContactButton;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_courses);

        mFindContactButton = (Button) findViewById(R.id.findCoursesButton);
        mFindContactButton.setOnClickListener();
                listView = (ListView) findViewById(R.id.ListView);

        final String[] strArr = new String[]{
                "Angular",
                "CSS",
                "Javascript",
                "Java",
                "Android",
                "Spark",
                "Firebase"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1, strArr);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                String value = strArr[i];
                Toast.makeText(CoursesActivity.this,value, Toast.LENGTH_LONG).show();

            }
        });
    }
}
