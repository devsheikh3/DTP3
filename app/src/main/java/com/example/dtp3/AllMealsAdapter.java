package com.example.dtp3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class AllMealsAdapter extends RecyclerView.Adapter<AllMealsAdapter.AllMealsViewHlder> {

    private String[] mealname;
    private String[] mealprice;
    private String[] mealtype;
    private int[] mealimage;
    private Boolean[] mealavailability;

    public AllMealsAdapter(String[] mealname, String[] mealprice, String[] mealtype, int[] mealimage, Boolean[] mealavailability) {
        this.mealname = mealname;
        this.mealprice = mealprice;
        this.mealtype = mealtype;
        this.mealimage = mealimage;
        this.mealavailability = mealavailability;
    }

    @NonNull
    @Override
    public AllMealsViewHlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.meal_view,parent,false);

        return new AllMealsViewHlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AllMealsViewHlder holder, int position) {

        final String name=mealname[position];
        holder.name.setText(name);
        String type=mealtype[position];
        holder.type.setText(type);
        String price=mealprice[position];
        holder.price.setText("Rs/-"+price);
        int image=mealimage[position];
        holder.image.setImageResource(image);
        Boolean availability=mealavailability[position];
        if (availability==true)
        {

            holder.availability.setChecked(true);
        }

        else if (availability==false)
        {

            holder.availability.setChecked(false);
        }

        if (holder.availability.isChecked()){

            holder.circle.setImageResource(R.drawable.rounded_yellow);
        }
        else{

            holder.circle.setImageResource(R.drawable.rounded_grey);
        }

        holder.availability.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b==true){

                   holder.circle.setImageResource(R.drawable.rounded_yellow);

                }

                else{

                    holder.circle.setImageResource(R.drawable.rounded_grey);

                }



            }
        });


       holder.circle.setOnClickListener(new View.OnClickListener() {
           private Context context;
           @Override
           public void onClick(View view) {
               context=view.getContext();
                Intent intent=new Intent(context,NextActivity.class);
                intent.putExtra("i",4);
                context.startActivity(intent);
               //((AppCompatActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.cheffullfragid,new MealDetails()).commit();

           }
       });

       holder.mealback.setOnClickListener(new View.OnClickListener() {
           private  Context context;
           @Override
           public void onClick(View view) {
               context=view.getContext();
               Intent intent=new Intent(context,NextActivity.class);
               intent.putExtra("i",4);
               context.startActivity(intent);
              // ((AppCompatActivity)context).getSupportFragmentManager().beginTransaction().replace(R.id.cheffullfragid,new MealDetails()).commit();

           }
       });


    }

    @Override
    public int getItemCount() {
        return mealname.length;
    }

    public class AllMealsViewHlder extends RecyclerView.ViewHolder{

        TextView name,price,type;
        Switch availability;
        ImageView image,circle;
        FloatingActionButton editmeal, addweekly, delete;
        ConstraintLayout mealback;

        public AllMealsViewHlder(@NonNull View itemView) {
            super(itemView);

            name=(TextView)itemView.findViewById(R.id.allmealnameid);
            price=(TextView)itemView.findViewById(R.id.allmealpriceid);
            type=(TextView)itemView.findViewById(R.id.allmealtypeid);
            availability=(Switch)itemView.findViewById(R.id.allmealswitchid);
            image=(ImageView)itemView.findViewById(R.id.allmealimageid);
            circle=(ImageView)itemView.findViewById(R.id.circleid);
            editmeal=(FloatingActionButton)itemView.findViewById(R.id.allmealeditid);
            addweekly=(FloatingActionButton)itemView.findViewById(R.id.allmealweekid);
            delete=(FloatingActionButton)itemView.findViewById(R.id.allmealdeleteid);
            mealback=itemView.findViewById(R.id.mealbackid);

        }
    }
}
