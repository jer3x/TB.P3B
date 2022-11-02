package com.example.t0319017;

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

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DaftarDokterFragment extends Fragment implements AdapterView.OnClickListener {

    private ListView listView;
    private ListView listView2;
    private SearchView searchView;
    private ArrayAdapter<String> adapter;
    private FloatingActionButton buttonTAMBAH;
    private FloatingActionButton buttonEDIT;

    String[] lst = {"Dr Budi", "Dr Ridwan", "Dr Andri"};
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
        View view = inflater.inflate(R.layout.daftar_dokter_flybutton, container, false);



        this.buttonTAMBAH = view.findViewById(R.id.fab_add);
        this.buttonEDIT = view.findViewById(R.id.fab_pen);
        this.buttonTAMBAH.setOnClickListener(this);
        this.buttonEDIT.setOnClickListener(this);

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
        if (view == this.buttonEDIT) {
            ((MainActivity) getActivity()).changePage(6);
            Log.d("Click", "CLICKED BUTTON EDIT");

//            InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
//            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        else if(view == this.buttonTAMBAH){
            ((MainActivity)getActivity()).changePage(7);
            Log.d("Click", "CLICKED BUTTON TAMBAH");
        }
        else{
            ((MainActivity)getActivity()).changePage(1);
        }
    }
}
