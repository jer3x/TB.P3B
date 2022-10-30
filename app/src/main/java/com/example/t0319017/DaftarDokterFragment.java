package com.example.t0319017;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class DaftarDokterFragment extends Fragment implements View.OnClickListener {

    public DaftarDokterFragment(){
        //Required empty public constuctor
    }

    public static DaftarDokterFragment newInstance() {
        DaftarDokterFragment fragment = new DaftarDokterFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.daftardokter_fragment, container, false);



        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
