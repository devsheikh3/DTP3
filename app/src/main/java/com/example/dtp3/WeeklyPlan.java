package com.example.dtp3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ogaclejapan.smarttablayout.SmartTabLayout;



public class WeeklyPlan extends Fragment {


    TextView monbtn, tuebtn, wedbtn, thubtn, fribtn, satbtn, sunbtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_weekly_plan, container, false);


        monbtn=(TextView)view.findViewById(R.id.monbtnid);
        tuebtn=(TextView)view.findViewById(R.id.tuebtnid);
        wedbtn=(TextView)view.findViewById(R.id.wedbtnid);
        thubtn=(TextView)view.findViewById(R.id.thubtnid);
        fribtn=(TextView)view.findViewById(R.id.fribtnid);
        satbtn=(TextView)view.findViewById(R.id.satbtnid);
        sunbtn=(TextView)view.findViewById(R.id.sunbtnid);

        monbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().replace(R.id.cheffragid,new DailyPlan()).commit();
            }
        });
        tuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.cheffragid,new DailyPlan()).commit();
            }
        });
        wedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().replace(R.id.cheffragid,new DailyPlan()).commit();

            }
        });
        thubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        fribtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        satbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        sunbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        return view;
    }
}
