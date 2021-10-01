package com.example.flowershop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder>{

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFlower;
        private TextView viewName;
        private TextView viewPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFlower= itemView.findViewById(R.id.imageView_Flower);
            viewName= itemView.findViewById(R.id.textName);
            viewPrice= itemView.findViewById(R.id.textPrice);
        }

    }

    private Context context;
    private ArrayList<Flowers> flowers;

    public FlowerAdapter(Context context, ArrayList<Flowers> flowers) {
        this.context= context;
        this.flowers= flowers;
    }

    @NonNull
    @Override
    public FlowerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View flowerView= inflater.inflate(R.layout.customcecycleview, viewGroup, false);
        ViewHolder viewHolder= new ViewHolder(flowerView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerAdapter.ViewHolder viewHolder, int i) {
        Flowers flower= flowers.get(i);
        viewHolder.imgFlower.setImageResource(flower.getImgFlower());
        viewHolder.viewName.setText(flower.getTextName());
        viewHolder.viewPrice.setText(flower.getTextPrice());
    }

    @Override
    public int getItemCount() {
        return flowers.size();
    }
}
