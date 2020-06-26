package com.example.dtp3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import de.hdodenhof.circleimageview.CircleImageView;


public class MealDetails extends Fragment {
    CircleImageView mealiamge, kitchenimage;
    TextView mealname,price,category,posttime, availablitytime, extradetails, kitchenname, numberofreviews, numberoforders, visitprofile;
    RatingBar kitchenrating;
    FloatingActionButton closemealdetials;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_meal_details, container, false);
        mealiamge=view.findViewById(R.id.mealdetailimageid);
        kitchenimage=view.findViewById(R.id.mealdetailskitchendpid);
        mealname=view.findViewById(R.id.mealdetailnameid);
        price=view.findViewById(R.id.mealdetailpriceid);
        category=view.findViewById(R.id.mealdetailcategoryid);
        posttime=view.findViewById(R.id.mealposttimeid);
        availablitytime=view.findViewById(R.id.mealtimecategoryid);
        extradetails=view.findViewById(R.id.extramealdetailsid);
        kitchenname=view.findViewById(R.id.mealdetailkkitchennameid);
        numberofreviews=view.findViewById(R.id.mealdetailreviewid);
        numberoforders=view.findViewById(R.id.mealdetailorderid);
        visitprofile=view.findViewById(R.id.mealdetailvisitkitchenid);
        kitchenrating=view.findViewById(R.id.mealdetailratingid);
        closemealdetials=view.findViewById(R.id.closemealdetailsid);

        visitprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        closemealdetials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(), ChefDashboard.class);
                startActivity(intent);

            }
        });


        return view;
    }
}
