package com.example.t0319017;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class TambahDokterFragment extends Fragment implements AdapterView.OnClickListener {

    private ArrayAdapter<String> adapter;
    private Button buttonHOMETAMBAHTDOKTER;
    private Button buttonSIMPANTAMBAHDOKTER;

    public TambahDokterFragment(){
        //Required empty public constuctor
    }

    public static TambahDokterFragment newInstance() {
        TambahDokterFragment fragment = new TambahDokterFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tambahdokter_fragment, container, false);



        this.buttonHOMETAMBAHTDOKTER = view.findViewById(R.id.buttonSIMPANTAMBAHDOKTER);
        this.buttonSIMPANTAMBAHDOKTER = view.findViewById(R.id.buttonCANCELETAMBAHDOKTER);
        this.buttonHOMETAMBAHTDOKTER.setOnClickListener(this);
        this.buttonSIMPANTAMBAHDOKTER.setOnClickListener(this);


        return view;

    }


    @Override
    public void onClick(View view) {
        if (view == this.buttonHOMETAMBAHTDOKTER) {
            ((MainActivity) getActivity()).changePage(2);
            Log.d("Click", "DOKTER BERHASIL DI TAMBAH");

//            InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        else{
            ((MainActivity)getActivity()).changePage(1);
            Log.d("Click", "BERGANTI KE HALAMAN HOME");
        }
    }
}

