package com.example.t0319017;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdapterDok extends BaseAdapter {
    private List<String> listItems;


    public AdapterDok(Activity activity){
        super();
        this.listItems=new ArrayList<String>();

    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listItems.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(view.getContext());
        textView.setText(listItems.get(i));
        return textView;
    }
}