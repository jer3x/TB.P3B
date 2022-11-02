//package com.example.t0319017;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//import android.widget.SearchView;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DaftarDokterFragment2 extends Fragment implements AdapterView.OnClickListener {
//
//    private ListView listView;
//    private ListView listView2;
//    private SearchView searchView;
//    private ArrayAdapter<String> adapter2;
//    private AdapterDok adapterDok;
//
//    String[] lst2 = {"Ahli Tulang", "Ahli Gigi"};
//
//    public DaftarDokterFragment2(){
//        //Required empty public constuctor
//    }
//
//    public static DaftarDokterFragment2 newInstance() {
//        DaftarDokterFragment2 fragment2 = new DaftarDokterFragment2();
//        return fragment2;
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.bidangdokter, container, false);
//
//
//        ListView listView = view.findViewById(R.id.textbid);
//        adapter2 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_2,lst2);
//        listView.setAdapter(adapter2);
//        return view;
//
//    }
//
//
//
//    @Override
//    public void onClick(View view) {
//
//    }
//}
