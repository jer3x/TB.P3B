package com.example.t0319017;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class DaftarDokterFragment extends Fragment implements AdapterView.OnClickListener {

    private ListView listView;
    private SearchView searchView;
    private ArrayAdapter<String> adapter;

        String[] lst = {"Dr Budi    Ahli Tulang", "Dr Ridwan    Ahli Tulang"};

    public DaftarDokterFragment(){
        //Required empty public constuctor
    }

    public static DaftarDokterFragment newInstance() {
        DaftarDokterFragment fragment = new DaftarDokterFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.daftardokter_list, container, false);

        ListView listView = view.findViewById(R.id.dok_list);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,lst);
        listView.setAdapter(adapter);
        return view;

    }



    @Override
    public void onClick(View view) {

    }
}
