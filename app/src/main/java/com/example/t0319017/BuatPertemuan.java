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

import java.util.Calendar;

public class BuatPertemuan extends DialogFragment implements View.OnClickListener {

    private Button buttonSimpan;
    private TextView textViewTime;
    private TextView textViewDate;
    private DatePickerDialog.OnDateSetListener dateSetListener;
    private int hour, minute;


    public BuatPertemuan() {
        //Required empty public constuctor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.buatpertemuan_fragment, container, false);

        this.buttonSimpan = view.findViewById(R.id.button_Simpan);
        this.textViewTime = view.findViewById(R.id.tvTime);
        this.textViewDate = view.findViewById(R.id.et_tgl);
        this.buttonSimpan.setOnClickListener(this);
        this.textViewTime.setOnClickListener(this);
        this.textViewDate.setOnClickListener(this);

        textViewDate.setOnClickListener(view1 -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(getContext(), android.R.style.Theme_DeviceDefault, dateSetListener, year, month, day);

            dialog.show();
        });

        dateSetListener = (datePicker, year, month, day) -> {
            month = month + 1;
            Log.d(TAG, "onDataSet: dd//mm/yyyy" + day + "/" + month + "/" + year);

            String date = day + "/" + month + "/" + year;
            textViewDate.setText(date);
        };

        textViewTime.setOnClickListener(view1 -> {
            Calendar mcurrentTime = Calendar.getInstance();
            int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
            int minute = mcurrentTime.get(Calendar.MINUTE);
            TimePickerDialog mTimePicker;
            mTimePicker = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                    textViewTime.setText(selectedHour + ":" + selectedMinute);
                }
            }, hour, minute, true);//Yes 24 hour time
            mTimePicker.setTitle("Select Time");
            mTimePicker.show();
        });

        return view;
    }


    public static BuatPertemuan newInstance() {
        BuatPertemuan fragment = new BuatPertemuan();
        return fragment;
    }

    @Override
    public void onClick(View view) {
        DialogFragment time = new BuatPertemuan();
        time.show(getChildFragmentManager(), "time picker");
        Log.d("click", "clicked");
        this.textViewTime.setText("");

        DialogFragment date = new BuatPertemuan();
        if (view == this.buttonSimpan) {
            ((MainActivity) getActivity()).changePage(4);
        }

    }
}
//    @NonNull
//    @Override
//    public Dialog onCreateDialog(Bundle saveInstanceState) {
//        Calendar calendar = Calendar.getInstance();
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        int minute = calendar.get(Calendar.MINUTE);
//
//        TimePickerDialog.OnTimeSetListener myTimeListener = (view, hourOfDay, minute1) -> {
//            if (view.isShown()) {
//                calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
//                calendar.set(Calendar.MINUTE, minute1);
//
//            }
//        };
//
//        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), android.R.style.Theme_Holo_Light_Dialog_NoActionBar, myTimeListener, hour, minute, true);
//        timePickerDialog.setTitle("Choose hour:");
//        timePickerDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
//        return timePickerDialog;


//        return new TimePickerDialog(getActivity(), (TimePickerDialog.OnTimeSetListener) getActivity(), hour, minute, DateFormat.is24HourFormat(getActivity()));


