package com.example.dtp3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class CreateMeal extends Fragment {

    FloatingActionButton closecreatemeal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_create_meal, container, false);

        closecreatemeal=(FloatingActionButton) view.findViewById(R.id.closecreatemealid);
        closecreatemeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().replace(R.id.kitchennestfragid,new BlankFragment()).commit();

            }
        });



        return view;
    }
}
