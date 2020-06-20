package com.example.dtp3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AskRole extends Fragment {

    Button asmonster, aschef;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ask_role, container, false);

        asmonster=(Button)view.findViewById(R.id.continuemonsterid);
        aschef=(Button)view.findViewById(R.id.continuechefid);

        asmonster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        aschef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().replace(R.id.signinsignupfragid,new ChefDetails()).commit();

            }
        });


        return view;
    }
}
