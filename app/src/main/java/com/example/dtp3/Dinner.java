package com.example.dtp3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class Dinner extends Fragment {

    RecyclerView dinnerlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dinner, container, false);

        dinnerlist=(RecyclerView)view.findViewById(R.id.dinnerlist);

        dinnerlist.setLayoutManager(new LinearLayoutManager(getContext()));
        String[] name={"Mutton"};
        String[] price={"450"};
        String[] type={"Dinner"};
        int[] image={R.drawable.food};
        Boolean[] availability={true};

        dinnerlist.setAdapter(new ActiveMealAdapter(name,price,type,image,availability));



        return view;
    }
}
