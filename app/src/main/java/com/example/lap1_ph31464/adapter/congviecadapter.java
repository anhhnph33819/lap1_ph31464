package com.example.lap1_ph31464.adapter;

import android.widget.BaseAdapter;

import java.util.ArrayList;

public class congviecadapter  extends BaseAdapter {
    private final Content context;
    private final ArrayList<congviec> list;

    public congviecadapter(Content context, ArrayList<congviec> list) {
        this.context = context;
        this.list = list;
    }

}
