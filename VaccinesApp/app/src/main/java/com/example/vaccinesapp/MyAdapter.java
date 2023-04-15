package com.example.vaccinesapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<>{

    // 1- Create Data Source
    private VaccineModel[] listData;

    public MyAdapter(VaccineModel[] listData)
    {
        this.listData = listData;
    }

    // 2- View Holder Class

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView;

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.imageView);

            this.textView = itemView.findViewById(R.id.textView);



        }


        

    }

}
