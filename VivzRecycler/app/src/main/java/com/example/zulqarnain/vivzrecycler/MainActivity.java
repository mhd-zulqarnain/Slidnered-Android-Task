package com.example.zulqarnain.vivzrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.zulqarnain.vivzrecycler.adapters.customAdapters;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Students> students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        students = new ArrayList<Students>();
        students.add(new Students("Ali","Science"));
        students.add(new Students("Ahmer","Arts"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);


        customAdapters adapter = new customAdapters(students);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
