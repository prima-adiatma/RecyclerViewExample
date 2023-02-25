package com.development.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //TEST GITHUB

    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;

    private ArrayList<String> countryNamelist = new ArrayList<>();
    private ArrayList<String> detailsList = new ArrayList<>();
    private ArrayList<Integer> imageList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvExample);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        countryNamelist.add("United Kingodom");
        countryNamelist.add("Germany");
        countryNamelist.add("USA");

        detailsList.add("This is the United Kingdom Flag");
        detailsList.add("This is the United Germany Flag");
        detailsList.add("This is the United USA Flag");

        imageList.add(R.drawable.unitedkingdom);
        imageList.add(R.drawable.germany);
        imageList.add(R.drawable.usa);

        adapter = new RecyclerViewAdapter(countryNamelist,detailsList,imageList,MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}