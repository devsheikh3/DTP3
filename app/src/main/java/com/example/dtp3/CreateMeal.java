package com.example.dtp3;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class CreateMeal extends Fragment {

    FloatingActionButton closecreatemeal,uploadmealiamge;
    Button create;
    Spinner mealtype;
    EditText mealname, mealprice, mealdetails;
    Switch availability;
    RelativeLayout beta;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_create_meal, container, false);
        uploadmealiamge=view.findViewById(R.id.uploadmealimageid);
        mealname=view.findViewById(R.id.mealnameid);
        mealprice=view.findViewById(R.id.mealpriceid);
        mealdetails=view.findViewById(R.id.mealdetailid);
        availability=view.findViewById(R.id.mealavailableid);
        beta=view.findViewById(R.id.mealdetaillayoutid);
        mealtype=view.findViewById(R.id.mealtypespinner);
        create=view.findViewById(R.id.createmealbtnid);
        closecreatemeal=(FloatingActionButton) view.findViewById(R.id.closecreatemealid);
        closecreatemeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(),ChefDashboard.class);
                startActivity(intent);

            }
        });

        uploadmealiamge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                showDialogue(view);

            }
        });

        beta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mealdetails.requestFocus();

            }
        });




        String[] items = new String[]{"Select Type","Breakfast", "Lunch", "Dinner"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mealtype.setAdapter(adapter);
        mealtype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {

                if( parent.getItemAtPosition(i).equals("Select Type")){

                }
                else {

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        return view;
    }



    private void showDialogue(View view) {
        AlertDialog.Builder builder= new AlertDialog.Builder(getContext(),R.style.AlertDialogueTheme);
        View view2 = LayoutInflater.from(getContext()).inflate(R.layout.alert_dialogue,(ConstraintLayout)view.findViewById(R.id.alertdialogueid));
        builder.setView(view2);
        ((TextView)view2.findViewById(R.id.dialgueheading)).setText("Add this meal in weekly schedule?");
        ((TextView)view2.findViewById(R.id.dialguedetails)).setText("Scheduled meal will be automatically updated according to the plan.... ");
        ((Button)view2.findViewById(R.id.dialguenegativebtn)).setText("No");
        ((Button)view2.findViewById(R.id.dialguepositivebtn)).setText("Add");

        final AlertDialog alertDialog=builder.create();
        view2.findViewById(R.id.dialguepositivebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getFragmentManager().beginTransaction().replace(R.id.nextfragid,new AddWeekly()).commit();
                alertDialog.hide();
            }
        });

        view2.findViewById(R.id.dialguenegativebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(),ChefDashboard.class);
                startActivity(intent);

            }
        });

        if (alertDialog.getWindow()!=null){

            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));

        }

        alertDialog.show();

    }


}
