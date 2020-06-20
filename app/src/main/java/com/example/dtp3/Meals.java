package com.example.dtp3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Meals extends Fragment {

    FloatingActionButton createmeal;
    RecyclerView allmealslist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_meals, container, false);

        createmeal=(FloatingActionButton)view.findViewById(R.id.createmealbtnid);
        allmealslist=(RecyclerView)view.findViewById(R.id.allmealslistid);
        createmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




            }
        });

        allmealslist.setLayoutManager(new LinearLayoutManager(getContext()));
        String[] name={"Biryani","Karahi","Sandwich","Mutton","Qoufty"};
        String[] price={"150","300","120","450","200"};
        String[] type={"Breafast","Dinner","Breakfast","Lunch","Lunch"};
        int[] image={R.drawable.food,R.drawable.food,R.drawable.food,R.drawable.food,R.drawable.food,};
        Boolean[] availability={true,true,false,false,true};

        allmealslist.setAdapter(new AllMealsAdapter(name,price,type,image,availability));


        return view;
    }
}
