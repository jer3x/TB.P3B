//package com.example.t0319017;
//
//import android.app.Dialog;
//import android.app.TimePickerDialog;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.TimePicker;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.DialogFragment;
//
//import java.util.Calendar;
//
//public class TimePickerFragment extends DialogFragment implements View.OnClickListener {
//
//    private TextView textView;
//    private EditText editText;
//    private Button button;
//
//    public TimePickerFragment() {
//        //Required empty public constuctor
//
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//
//        //Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.buatpertemuan_fragment, container, false);
//
//
//        this.textView = view.findViewById(R.id.tvTime);
//
//        this.textView.setOnClickListener(this);
//
//
//        return view;
//    }
//
//
//    public static TimePickerFragment newInstance() {
//        TimePickerFragment fragment = new TimePickerFragment();
//        return fragment;
//    }
//
//    @Override
//    public void onClick(View view) {
//        DialogFragment time = new TimePickerFragment();
//        time.show(getChildFragmentManager(), "time picker");
//        Log.d("click", "clicked");
//        this.textView.setText("");
//
//    }
//
//    @NonNull
//    @Override
//    public Dialog onCreateDialog(Bundle saveInstanceState) {
//        Calendar calendar = Calendar.getInstance();
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        int minute = calendar.get(Calendar.MINUTE);
//
//        TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
//            @Override
//            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                if (view.isShown()) {
//                    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
//                    calendar.set(Calendar.MINUTE, minute);
//
//                }
//            }
//        };
//
//        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), android.R.style.Theme_Holo_Light_Dialog_NoActionBar, myTimeListener, hour, minute, true);
//        timePickerDialog.setTitle("Choose hour:");
//        timePickerDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
//        return timePickerDialog;
//
//
////        return new TimePickerDialog(getActivity(), (TimePickerDialog.OnTimeSetListener) getActivity(), hour, minute, DateFormat.is24HourFormat(getActivity()));
//
//    }
//}