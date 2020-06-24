package com.example.dtp3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import de.hdodenhof.circleimageview.CircleImageView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.michaldrabik.classicmaterialtimepicker.CmtpTimeDialogFragment;
import com.michaldrabik.classicmaterialtimepicker.OnTime12PickedListener;
import com.michaldrabik.classicmaterialtimepicker.model.CmtpTime12;


public class KitchenDetails extends Fragment {

    CircleImageView kitchenimage;
    FloatingActionButton uploadKitchenImage;
    ImageView locationbutton;
    TextView starttime, endtime, backKitchen;
    EditText kitchenName, kitchenlocation, kitchenabout;
    Button signupkitchen;


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_kitchen_details, container, false);

       locationbutton=(ImageView)view.findViewById(R.id.kitchenlocationbtnid);
       uploadKitchenImage=(FloatingActionButton)view.findViewById(R.id.uploadkitchenImageid);
       signupkitchen=(Button)view.findViewById(R.id.signupkitchenid);
       kitchenName=(EditText)view.findViewById(R.id.kitchennameid);
       kitchenlocation=(EditText)view.findViewById(R.id.kitchenlocationid);
       starttime=view.findViewById(R.id.kitchenservicehourstartid);
       endtime=view.findViewById(R.id.kitchenservicehourendid);
       kitchenabout=(EditText)view.findViewById(R.id.aboutkitchenid);
       backKitchen=view.findViewById(R.id.backkitchendetailsid);

       backKitchen.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               getFragmentManager().beginTransaction().replace(R.id.signinsignupfragid,new ChefDetails()).commit();

           }
       });



        uploadKitchenImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {



           }
       });

       locationbutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               chagebutton();

           }
       });

       signupkitchen.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent= new Intent(getContext(),ChefDashboard.class);
               startActivity(intent);

           }
       });

       starttime.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

                CmtpTimeDialogFragment timePicker = CmtpTimeDialogFragment.newInstance("Set","Cancel");
               timePicker.show(getFragmentManager(), "time");
               timePicker.setInitialTime12(12,0, CmtpTime12.PmAm.AM);
               timePicker.setOnTime12PickedListener(new OnTime12PickedListener() {
                   @Override
                   public void onTimePicked(CmtpTime12 cmtpTime12) {

                       starttime.setText(cmtpTime12.toString());

                   }
               });

           }
       });

        endtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CmtpTimeDialogFragment timePicker = CmtpTimeDialogFragment.newInstance();
                timePicker.show(getFragmentManager(), "time");
                timePicker.setInitialTime12(12,0, CmtpTime12.PmAm.AM);
                timePicker.setOnTime12PickedListener(new OnTime12PickedListener() {
                    @Override
                    public void onTimePicked(CmtpTime12 cmtpTime12) {

                        endtime.setText(cmtpTime12.toString());

                    }
                });


            }
        });





       return view;

    }

    private void chagebutton() {

        if (locationbutton.getDrawable() == getResources().getDrawable( R.drawable.ic_my_location_black_24dp))
        {
            locationbutton.setImageResource(R.drawable.ic_gps_not_fixed_black_24dp);
        }
        else if(locationbutton.getDrawable() == getResources().getDrawable( R.drawable.ic_gps_not_fixed_black_24dp))
        {
            locationbutton.setImageResource(R.drawable.ic_my_location_black_24dp);
        }

    }
}
