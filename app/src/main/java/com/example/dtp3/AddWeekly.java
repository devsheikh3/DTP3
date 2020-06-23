package com.example.dtp3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class AddWeekly extends Fragment {

    RadioButton  monday,tuesday,wednesday,thursday,friday,saturday,sunday;
    Spinner mon,tue,wed,thu,fri,sat,sun;
    FloatingActionButton closeaddweekly;
    Button saveweekly;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_add_weekly, container, false);

        closeaddweekly=view.findViewById(R.id.closeaddweeklyid);
        saveweekly=view.findViewById(R.id.saveweeklyid);


        monday=view.findViewById(R.id.mondayradioid);
        tuesday=view.findViewById(R.id.tuesdayradioid);
        wednesday=view.findViewById(R.id.wednesdayradioid);
        thursday=view.findViewById(R.id.thursdayradioid);
        friday=view.findViewById(R.id.fridayradioid);
        saturday=view.findViewById(R.id.saturdayradioid);
        sunday=view.findViewById(R.id.sundayradioid);


        mon=view.findViewById(R.id.mondayspinnerid);
        tue=view.findViewById(R.id.tuesdayspinnerid);
        wed=view.findViewById(R.id.wednesdayspinnerid);
        thu=view.findViewById(R.id.thursdayspinnerid);
        fri=view.findViewById(R.id.fridayspinnerid);
        sat=view.findViewById(R.id.saturdayspinnerid);
        sun=view.findViewById(R.id.sundayspinnerid);


        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!monday.isSelected()) {
                    monday.setChecked(true);
                    monday.setSelected(true);
                    mon.setVisibility(View.VISIBLE);
                } else {
                    monday.setChecked(false);
                    monday.setSelected(false);
                    mon.setVisibility(View.INVISIBLE);
                }


            }
        });

        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tuesday.isSelected()) {
                    tuesday.setChecked(true);
                    tuesday.setSelected(true);
                    tue.setVisibility(View.VISIBLE);
                } else {
                    tuesday.setChecked(false);
                    tuesday.setSelected(false);
                    tue.setVisibility(View.INVISIBLE);
                }


            }
        });

        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!wednesday.isSelected()) {
                    wednesday.setChecked(true);
                    wednesday.setSelected(true);
                    wed.setVisibility(View.VISIBLE);
                } else {
                    wednesday.setChecked(false);
                    wednesday.setSelected(false);
                    wed.setVisibility(View.INVISIBLE);
                }


            }
        });


        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!thursday.isSelected()) {
                    thursday.setChecked(true);
                    thursday.setSelected(true);
                    thu.setVisibility(View.VISIBLE);
                } else {
                    thursday.setChecked(false);
                    thursday.setSelected(false);
                    thu.setVisibility(View.INVISIBLE);
                }


            }
        });

        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!friday.isSelected()) {
                    friday.setChecked(true);
                    friday.setSelected(true);
                    fri.setVisibility(View.VISIBLE);
                } else {
                    friday.setChecked(false);
                    friday.setSelected(false);
                    fri.setVisibility(View.INVISIBLE);
                }


            }
        });

        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!saturday.isSelected()) {
                    saturday.setChecked(true);
                    saturday.setSelected(true);
                    sat.setVisibility(View.VISIBLE);
                } else {
                    saturday.setChecked(false);
                    saturday.setSelected(false);
                    sat.setVisibility(View.INVISIBLE);
                }


            }
        });

        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!sunday.isSelected()) {
                    sunday.setChecked(true);
                    sunday.setSelected(true);
                    sun.setVisibility(View.VISIBLE);
                } else {
                    sunday.setChecked(false);
                    sunday.setSelected(false);
                    sun.setVisibility(View.INVISIBLE);
                }


            }
        });





        closeaddweekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(),ChefDashboard.class);
                startActivity(intent);

            }
        });

        saveweekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(),ChefDashboard.class);
                startActivity(intent);

            }
        });

        String[] items = new String[]{"Select Type","Breakfast", "Lunch", "Dinner"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        mon.setAdapter(adapter);
        mon.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if( parent.getItemAtPosition(i).equals("Select Type")){

                }
                else {

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        tue.setAdapter(adapter);
        tue.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if( parent.getItemAtPosition(i).equals("Select Type")){

                }
                else {

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        wed.setAdapter(adapter);
        wed.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if( parent.getItemAtPosition(i).equals("Select Type")){

                }
                else {

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        thu.setAdapter(adapter);
        thu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if( parent.getItemAtPosition(i).equals("Select Type")){

                }
                else {

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        fri.setAdapter(adapter);
        fri.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if( parent.getItemAtPosition(i).equals("Select Type")){

                }
                else {

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sat.setAdapter(adapter);
        sat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if( parent.getItemAtPosition(i).equals("Select Type")){

                }
                else {

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sun.setAdapter(adapter);
        sun.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if( parent.getItemAtPosition(i).equals("Select Type")){

                }
                else {

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });







        return view;
    }
}
