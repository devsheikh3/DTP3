package com.example.dtp3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;


public class DailyPlan extends Fragment {

    FragmentPagerAdapter adapterViewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_daily_plan, container, false);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.dailymealtabpager);
        SmartTabLayout viewPagerTab = (SmartTabLayout) view.findViewById(R.id.dailymealtab);
        adapterViewPager = new PageAdapter(getFragmentManager());
        viewPager.setAdapter(adapterViewPager);
        viewPagerTab.setViewPager(viewPager);





        return view;
    }


    public static class PageAdapter extends FragmentPagerAdapter{


        private static int pagenumbers=3;
        private String tabTitles[] = new String[]{"Breakfast", "Lunch", "Dinner"};


        public PageAdapter(@NonNull FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new Breakfast();
                case 1:
                    return new Lunch();
                case 2:
                    return new Dinner();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return pagenumbers;
        }


        @Override
        public CharSequence getPageTitle(int position){
            return tabTitles[position];


        }
    }









}
