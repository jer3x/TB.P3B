package com.example.t0319017;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LeftFragment extends Fragment implements View.OnClickListener{

    private Button home;
    private Button dokter;
    private Button exit;
    private Button buatpertemuan;


    public LeftFragment(){
        //Required empty public constructor

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_left, container, false);


        this.home = view.findViewById(R.id.home);
        this.dokter = view.findViewById(R.id.dokter);
        this.buatpertemuan = view.findViewById(R.id.pertemuan);
        this.exit = view.findViewById(R.id.exit);

        this.home.setOnClickListener(this);
        this.dokter.setOnClickListener(this);
        this.exit.setOnClickListener(this);
        this.buatpertemuan.setOnClickListener(this);

        return view;
    }
    public static LeftFragment newInstance() {
        LeftFragment fragment = new LeftFragment();
        return fragment;
    }

    @Override
    public void onClick(View view){
        if(view == this.home){
            ((MainActivity)getActivity()).changePage(1);
        }
        else if(view == this.dokter){
            ((MainActivity)getActivity()).changePage(2);
        }
        else if(view == this.buatpertemuan){
            ((MainActivity)getActivity()).changePage(3);
        }
        else{
            ((MainActivity)getActivity()).closeApplication();
        }
    }

}


