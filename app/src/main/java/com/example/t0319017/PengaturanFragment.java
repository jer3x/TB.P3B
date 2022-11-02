package com.example.t0319017;

import static android.content.ContentValues.TAG;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class PengaturanFragment extends DialogFragment implements View.OnClickListener {

    private Button buttonSIMPAN;
    private Button buttonCANCEL;

    public PengaturanFragment() {
        //Required empty public constuctor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.pengaturan_fragment, container, false);

        this.buttonSIMPAN = view.findViewById(R.id.button_SAVESETTING);
        this.buttonSIMPAN.setOnClickListener(this);

        this.buttonCANCEL = view.findViewById(R.id.button_CANCELSETTING);
        this.buttonCANCEL.setOnClickListener(this);
        return view;
    }

    public static PengaturanFragment newInstance() {
        PengaturanFragment fragment = new PengaturanFragment();
        return fragment;
    }

    @Override
    public void onClick(View view) {

        if (view == this.buttonSIMPAN) {
            ((MainActivity) getActivity()).changePage(5);
            Log.d("Click", "PENGATURAN BERHASIL DISIMPAN");
        }
        else{
            ((MainActivity)getActivity()).changePage(1);
            Log.d("Click", "PENGATURAN BATAL DISIMPAN");
        }
    }
}
