package com.example.dtp3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class PinVerification extends Fragment {

    TextView phonetext, codedigit1, codedigit2, codedigit3, codedigit4, pintime;
    FloatingActionButton resendPin;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_pin_verification, container, false);

        phonetext=(TextView)view.findViewById(R.id.phonetextid);
        codedigit1=(TextView)view.findViewById(R.id.otpid1);
        codedigit1=(TextView)view.findViewById(R.id.otpid2);
        codedigit1=(TextView)view.findViewById(R.id.otpid3);
        codedigit1=(TextView)view.findViewById(R.id.otpid4);
        pintime=(TextView)view.findViewById(R.id.pintimertextid);
        resendPin=(FloatingActionButton)view.findViewById(R.id.pinresendbtnid);

        resendPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                getFragmentManager().beginTransaction().replace(R.id.signinsignupfragid,new AskRole()).commit();

            }
        }, 4000);



        return view;
    }
}
