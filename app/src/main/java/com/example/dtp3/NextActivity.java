package com.example.dtp3;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NextActivity extends AppCompatActivity {
int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
      this.i=getIntent().getIntExtra("i",0);

if(i==2) {
    getSupportFragmentManager().beginTransaction().replace(R.id.nextfragid, new CreateMeal()).commit();
}
else if(i==3){
    getSupportFragmentManager().beginTransaction().replace(R.id.nextfragid, new Notification()).commit();
}


    }
}
