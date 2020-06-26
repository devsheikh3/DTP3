package com.example.dtp3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.circularreveal.CircularRevealFrameLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class ChefDashboard extends AppCompatActivity {

    //BottomNavigationView chefnavigation;
    FloatingActionButton cheffnotificationbtn;
    boolean flag = false;
    FragmentTransaction fTrans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef_dashboard);

        final SpaceNavigationView spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem(null, R.drawable.ic_restaurant_menu_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem(null, R.drawable.ic_update_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem(null, R.drawable.ic_turned_in_not_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem(null, R.drawable.ic_monetization_on_black_24dp));
        spaceNavigationView.setSpaceItemIconSize((int) getResources().getDimension(R.dimen.navicondimension));
        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {

                spaceNavigationView.setCentreButtonRippleColor(ContextCompat.getColor(ChefDashboard.this, R.color.colorAccent));
                Intent intent= new Intent(ChefDashboard.this,NextActivity.class);
                intent.putExtra("i",2);
                startActivity(intent);

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {


                Fragment selectedFragment=null;

                switch(itemIndex){

                    case 0:
                        selectedFragment=new Meals();
                        break;
                    case 1:
                        selectedFragment=new WeeklyPlan();
                        break;
                    case 2:
                        selectedFragment=new Orders();
                        break;
                    case 3:
                        selectedFragment=new ChefPayments();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.cheffragid,selectedFragment).commit();

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {



            }
        });

        cheffnotificationbtn=(FloatingActionButton) findViewById(R.id.notificationbtnid);
        //chefnavigation=(BottomNavigationView)findViewById(R.id.chefnavigationid);
        //chefnavigation.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.cheffragid,new Meals()).commit();


        cheffnotificationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fTrans = getSupportFragmentManager().beginTransaction();
                if(flag) {
                    fTrans.remove(getSupportFragmentManager().findFragmentById(R.id.cheffragid));
                    spaceNavigationView.setVisibility(View.VISIBLE);
                } else {
                    fTrans.add(R.id.cheffragid, new Notification());
                    spaceNavigationView.setVisibility(View.GONE);
                }
                flag = !flag;
                fTrans.commit();


                //Intent intent= new Intent(ChefDashboard.this,NextActivity.class);
                //intent.putExtra("next",3);
                //startActivity(intent);
               // getSupportFragmentManager().beginTransaction().replace(R.id.cheffragid,new Notification()).commit();



            }
        });





    }

   /* private BottomNavigationView.OnNavigationItemSelectedListener navListener= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment=null;

            switch(menuItem.getItemId()){


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
    };*/


    }

