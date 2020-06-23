package com.example.dtp3;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Breakfast extends Fragment {

    RecyclerView breakfastlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_breakfast, container, false);


        breakfastlist=(RecyclerView)view.findViewById(R.id.breakfastlist);

        breakfastlist.setLayoutManager(new LinearLayoutManager(getContext()));
        String[] name={"Qoufty"};
        String[] price={"200"};
        String[] type={"Breakfast"};
        int[] image={R.drawable.food};
        Boolean[] availability={true};

        breakfastlist.setAdapter(new AllMealsAdapter(name,price,type,image,availability))  ;



        return view;
    }
}
