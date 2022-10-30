package com.example.t0319017;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    private TextView textView;

    public SecondFragment(){
        //Required empty public constructor

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        this.textView = view.findViewById(R.id.fl_fs);

        return view;

    }

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
        return fragment;
    }

}