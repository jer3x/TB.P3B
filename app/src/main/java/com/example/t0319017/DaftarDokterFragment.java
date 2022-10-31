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
    private ListView listView2;
    private SearchView searchView;
    private ArrayAdapter<String> adapter;

    String[] lst = {"Dr Budi", "Dr Ridwan"};
    String[] lst2 = {"Dr Budi", "Dr Ridwan"};

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
        View view = inflater.inflate(R.layout.daftardokter, container, false);


        ListView listView = view.findViewById(R.id.text_title);
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,lst);
        listView.setAdapter(adapter);
//        ListView listView2 = view.findViewById(R.id.text_title);
//        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_2,lst2);
//        listView.setAdapter(adapter);
        return view;

    }



    @Override
    public void onClick(View view) {

    }
}
