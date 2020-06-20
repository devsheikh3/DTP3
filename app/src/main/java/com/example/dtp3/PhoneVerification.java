package com.example.dtp3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class PhoneVerification extends Fragment {

    Button verifybtn;
    EditText phonenumber;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_phone_verification, container, false);

        verifybtn=(Button)view.findViewById(R.id.verifynuberid);
        phonenumber=(EditText)view.findViewById(R.id. phonenumberid);

        verifybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().replace(R.id.signinsignupfragid,new PinVerification()).commit();

            }
        });




        return view;
    }
}
