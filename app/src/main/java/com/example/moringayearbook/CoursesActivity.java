package com.example.moringayearbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    private ListView listView;

    final String[] strArr = new String[]{
            "Angular",
            "CSS",
            "Javascript",
            "Java",
            "Android",
            "Spark",
            "Firebase"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_courses);

        mFindContactButton = (Button) findViewById(R.id.findContactButton);
        mFindContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoursesActivity.this, ContactActivity.class);
                startActivity(intent);
            }
        });

                listView = (ListView) findViewById(R.id.ListView);

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
