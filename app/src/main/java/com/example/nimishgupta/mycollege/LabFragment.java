package com.example.nimishgupta.mycollege;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class LabFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_lab, container, false);

        Spinner spinner = (Spinner) v.findViewById(R.id.spinner_lab);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),
                                                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.lab_size));

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        View v1 = inflater.inflate(R.layout.fragment_lab, container, false);

        Spinner spinner1 = (Spinner) v1.findViewById(R.id.spinner_lab);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this.getActivity(),
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.lab_size));

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        return v;
    }
}
