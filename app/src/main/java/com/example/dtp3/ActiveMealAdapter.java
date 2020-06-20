package com.example.dtp3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ActiveMealAdapter extends RecyclerView.Adapter<ActiveMealAdapter.ActiveMealViewHolder> {

    private String[] mealname;
    private String[] mealprice;
    private String[] mealtype;
    private int[] mealimage;
    private Boolean[] mealavailability;

    public ActiveMealAdapter(String[] mealname, String[] mealprice, String[] mealtype, int[] mealimage, Boolean[] mealavailability) {
        this.mealname = mealname;
        this.mealprice = mealprice;
        this.mealtype = mealtype;
        this.mealimage = mealimage;
        this.mealavailability = mealavailability;
    }


    @NonNull
    @Override
    public ActiveMealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.meal_view,parent,false);

        return new ActiveMealViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActiveMealViewHolder holder, int position) {

        String name=mealname[position];
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



    }

    @Override
    public int getItemCount() {
        return mealname.length;
    }

    public class ActiveMealViewHolder extends RecyclerView.ViewHolder{

        TextView name,price,type;
        Switch availability;
        ImageView image;
        FloatingActionButton editmeal,deletemeal,schedulemeal;


        public ActiveMealViewHolder(@NonNull View itemView) {
            super(itemView);

            name=(TextView)itemView.findViewById(R.id.allmealnameid);
            price=(TextView)itemView.findViewById(R.id.allmealpriceid);
            type=(TextView)itemView.findViewById(R.id.allmealtypeid);
            availability=(Switch)itemView.findViewById(R.id.allmealswitchid);
            image=(ImageView)itemView.findViewById(R.id.allmealimageid);
            editmeal=(FloatingActionButton)itemView.findViewById(R.id.allmealeditid);
            deletemeal=(FloatingActionButton)itemView.findViewById(R.id.allmealdeleteid);
            schedulemeal=(FloatingActionButton)itemView.findViewById(R.id.allmealweekid);



        }
    }
}
