package com.example.nimishgupta.mycollege;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class LectureFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lecture, container, false);
        //First spinner for Size OF LT
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner_toChooseLTsize);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
                                                        android.R.layout.simple_list_item_1,getResources().getStringArray( R.array.lectureHallSize));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //Spinner for Time Slot
        Spinner spinner1 = (Spinner)v.findViewById(R.id.spinner_toChooseTimeSlot);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this.getActivity(),
                                                        android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.timeSlotofLT));
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        return v;
    }

//    public void onBackPressed() {
//        new AlertDialog.Builder()
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setTitle("Closing Activity")
//                .setMessage("Are you sure you want to close this activity?")
//                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
//                {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        getActivity().finish();
//                    }
//
//                })
//                .setNegativeButton("No", null)
//                .show();
//    }


}
