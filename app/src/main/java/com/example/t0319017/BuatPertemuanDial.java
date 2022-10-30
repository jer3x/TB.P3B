package com.example.t0319017;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class BuatPertemuanDial extends Fragment implements View.OnClickListener {

    Button dial;

    public BuatPertemuanDial() {
        //Required empty public constuctor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sudahbikinpertemuan_fragment, container, false);


        this.dial = view.findViewById(R.id.dial);
        this.dial.setOnClickListener(this);
        return view;
    }
    public void onClick(View view){
        Intent intentCall = new Intent(Intent.ACTION_DIAL);
        intentCall.setData(Uri.parse("tel:6181901017"));
        startActivity(intentCall);
    }

    public static BuatPertemuanDial newInstance() {
        BuatPertemuanDial fragment = new BuatPertemuanDial();
        return fragment;
    }
}
