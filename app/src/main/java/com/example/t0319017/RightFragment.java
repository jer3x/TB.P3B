package com.example.t0319017;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class RightFragment extends Fragment {

    private TextView textView;

    public RightFragment(){
        //Required empty public constructor

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflate the layoyt for this fragment
        View view = inflater.inflate(R.layout.fragment_right, container, false);

        this.textView = view.findViewById(R.id.right_drawer);

        return view;

    }



}