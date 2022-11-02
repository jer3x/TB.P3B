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

public class EditDoctorFragment extends Fragment implements AdapterView.OnClickListener {

    private ArrayAdapter<String> adapter;
    private Button buttonHOMEEDITDOKTER;
    private Button buttonSIMPANEDITDOKTER;

    public EditDoctorFragment(){
        //Required empty public constuctor
    }

    public static EditDoctorFragment newInstance() {
        EditDoctorFragment fragment = new EditDoctorFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.editdokter_fragment, container, false);



        this.buttonHOMEEDITDOKTER = view.findViewById(R.id.buttonSIMPANEDITDOKTER);
        this.buttonSIMPANEDITDOKTER = view.findViewById(R.id.buttonCANCELEDITDOKTER);
        this.buttonHOMEEDITDOKTER.setOnClickListener(this);
        this.buttonSIMPANEDITDOKTER.setOnClickListener(this);


        return view;

    }


    @Override
    public void onClick(View view) {
        if (view == this.buttonHOMEEDITDOKTER) {
            ((MainActivity) getActivity()).changePage(2);
            Log.d("Click", "EDIT DOKTER BERHASIL DI UBAH");

//            InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        else{
            ((MainActivity)getActivity()).changePage(1);
            Log.d("Click", "BERGANTI KE HALAMAN HOME");
        }
    }
}
