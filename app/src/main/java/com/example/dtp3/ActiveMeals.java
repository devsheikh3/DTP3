package com.example.dtp3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ActiveMeals extends Fragment {

    RecyclerView activemealslist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_active_meals, container, false);
        activemealslist=(RecyclerView)view.findViewById(R.id.activemeallistid);

        activemealslist.setLayoutManager(new LinearLayoutManager(getContext()));
        String[] name={"Biryani","Mutton","Qoufty"};
        String[] price={"120","450","200"};
        String[] type={"Breafast","Dinner","Breakfast"};
        int[] image={R.drawable.food,R.drawable.food,R.drawable.food};
        Boolean[] availability={true,true,true};

        activemealslist.setAdapter(new ActiveMealAdapter(name,price,type,image,availability));




        return view;
    }
}
