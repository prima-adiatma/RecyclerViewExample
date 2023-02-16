package com.development.recyclerviewexample;

import android.content.Context;

import java.util.ArrayList;

public class RecyclerViewAdapter {

    private ArrayList<String> countryNamelist;
    private ArrayList<String> detailsList;
    private ArrayList<Integer> imageList;
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> countryNamelist, ArrayList<String> detailsList, ArrayList<Integer> imageList, Context context) {
        this.countryNamelist = countryNamelist;
        this.detailsList = detailsList;
        this.imageList = imageList;
        this.context = context;
    }
}
