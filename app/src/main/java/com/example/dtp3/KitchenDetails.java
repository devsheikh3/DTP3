package com.example.dtp3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import de.hdodenhof.circleimageview.CircleImageView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class KitchenDetails extends Fragment {

    CircleImageView kitchenimage;
    FloatingActionButton uploadKitchenImage;
    ImageView locationbutton;
    EditText kitchenName, kitchenlocation, kitchenservicehours, kitchenabout;
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
       kitchenservicehours=(EditText)view.findViewById(R.id.kitchenservicehoursid);
       kitchenabout=(EditText)view.findViewById(R.id.aboutkitchenid);



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
