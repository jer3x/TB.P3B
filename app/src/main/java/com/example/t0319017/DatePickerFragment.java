//package com.example.t0319017;
//
//import static android.content.ContentValues.TAG;
//
//import android.app.DatePickerDialog;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.EditText;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//
//import java.util.Calendar;
//
//public class DatePickerFragment extends Fragment {
//
//    private TextView textView;
//    private EditText editText;
//    private DatePickerDialog.OnDateSetListener dateSetListener;
//
//    public DatePickerFragment(){
//        //Required empty public constuctor
//
//    }
//
//    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//        View view = inflater.inflate(R.layout.buatpertemuan_fragment, container, false);
//
//        this.textView = view.findViewById(R.id.tv_tanggal);
//        this.editText = view.findViewById(R.id.et_tgl);
//
//        textView.setOnClickListener(view1 -> {
//            Calendar calendar = Calendar.getInstance();
//            int year = calendar.get(Calendar.YEAR);
//            int month = calendar.get(Calendar.MONTH);
//            int day = calendar.get(Calendar.DAY_OF_MONTH);
//
//            DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_DeviceDefault, dateSetListener, year, month, day);
//
//            dialog.show();
//        });
//
//        dateSetListener = (datePicker, year, month, day) -> {
//            month = month + 1;
//            Log.d(TAG,"onDataSet: dd//mm/yyyy" + day +"/" + month + "/" + year );
//
//            String date = day + "/" + month + "/" + year;
//            textView.setText(date);
//        };
//
//        return view;
//    }
//
//    public DatePickerFragment newInstance() {
//        DatePickerFragment fragment = new DatePickerFragment();
//        return fragment;
//    }
//}
