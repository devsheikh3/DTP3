package com.example.dtp3;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class Lunch extends Fragment {

    RecyclerView lunchlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_lunch, container, false);

        lunchlist=(RecyclerView)view.findViewById(R.id.lunchlist);

        lunchlist.setLayoutManager(new LinearLayoutManager(getContext()));
        String[] name={"Biryani"};
        String[] price={"120"};
        String[] type={"Lunch"};
        int[] image={R.drawable.food};
        Boolean[] availability={true};

        lunchlist.setAdapter(new ActiveMealAdapter(name,price,type,image,availability));



        return view;
    }
}
