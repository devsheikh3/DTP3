package com.example.dtp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.circularreveal.CircularRevealFrameLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ChefDashboard extends AppCompatActivity {

    BottomNavigationView chefnavigation;
    FloatingActionButton cheffnotificationbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_dashboard);

        cheffnotificationbtn=(FloatingActionButton) findViewById(R.id.notificationbtnid);
        chefnavigation=(BottomNavigationView)findViewById(R.id.chefnavigationid);
        chefnavigation.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.cheffragid,new ActiveMeals()).commit();


        cheffnotificationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });






    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment=null;

            switch(menuItem.getItemId()){

                case R.id.active:
                    selectedFragment=new ActiveMeals();
                    break;
                case R.id.meals:
                    selectedFragment=new Meals();
                    break;
                case R.id.weekly:
                    selectedFragment=new WeeklyPlan();
                    break;
                case R.id.orders:
                    selectedFragment=new Orders();
                    break;
                case R.id.payments:
                    selectedFragment=new ChefPayments();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.cheffragid,selectedFragment).commit();

            return true;
        }
    };


    }

