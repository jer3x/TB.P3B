package com.example.t0319017;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class ResultDialogFragment extends DialogFragment{

    private TextView textView;

    public ResultDialogFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_result_dialog, container, false);

        this.textView = view.findViewById(R.id.tvResult);
        this.textView.setText(this.getArguments().getString("title",""));

        return view;
    }

    public static ResultDialogFragment newInstance(String title){
        ResultDialogFragment fragment = new ResultDialogFragment();
        Bundle args = new Bundle();
        args.putString("title", "Your input : " + title);
        fragment.setArguments(args);
        return fragment;
    }
}

