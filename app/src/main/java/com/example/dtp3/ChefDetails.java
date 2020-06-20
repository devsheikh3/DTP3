package com.example.dtp3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ChefDetails extends Fragment {

    EditText cheffirstname, cheflastname, chefemail, chefCNIC;
    Spinner chefgenderdropdown;
    FloatingActionButton nextbtnchef, attachFile ;
    TextView filenames;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_chef_details, container, false);

        cheffirstname=(EditText)view.findViewById(R.id.cheffirstnameid);
        cheflastname=(EditText)view.findViewById(R.id.cheflastnameid);
        chefemail=(EditText)view.findViewById(R.id.chefemailid);
        chefCNIC=(EditText)view.findViewById(R.id.chefcnicid);
        attachFile=(FloatingActionButton)view.findViewById(R.id.attachfilebtnid);
         nextbtnchef=(FloatingActionButton)view.findViewById(R.id.chefdetailnextid);
         filenames=(TextView)view.findViewById(R.id.attachfilenametextid);
         chefgenderdropdown =(Spinner) view.findViewById(R.id.chefgenderspinner);

         String[] items = new String[]{"Male", "Female", "Other"};
         ArrayAdapter<String>adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item,items);
         adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         chefgenderdropdown.setAdapter(adapter);


         nextbtnchef.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 getFragmentManager().beginTransaction().replace(R.id.signinsignupfragid,new KitchenDetails()).commit();

             }
         });


        return view;
    }
}
