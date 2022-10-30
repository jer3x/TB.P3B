package com.example.t0319017;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.t0319017.R;


public class MainFragment extends Fragment implements View.OnClickListener {

    private MainFragment mainFragment;
    private Button button;
    private EditText editText;
    private FragmentManager fragmentManager;
    private ResultDialogFragment resultDialogFragment;

    public MainFragment(){
        //Required empty public constuctor

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        this.button = view.findViewById(R.id.buttonPert);
        this.button.setOnClickListener(this);
        return view;

    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onClick(View view){
        if(view == this.button){
            ((MainActivity)getActivity()).changePage(3);
        }
        else{
            ((MainActivity)getActivity()).closeApplication();
        }


    }






}