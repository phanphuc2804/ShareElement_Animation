package com.example.flowershop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class flowers_page extends AppCompatActivity {
    RecyclerView recyclerView;
    FlowerAdapter flowerAdapter;
    ArrayList<Flowers> flowers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers_page);

        recyclerView= findViewById(R.id.recyclerflower);
        flowers= new ArrayList<>();
        createFlowerList();
        flowerAdapter= new FlowerAdapter(this,flowers);
        recyclerView.setAdapter(flowerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void createFlowerList() {
        flowers.add(new Flowers(R.drawable.flo2,"Lavender","25$"));
        flowers.add(new Flowers(R.drawable.flo3,"Yellow","23$"));
        flowers.add(new Flowers(R.drawable.flo4,"Light Lavender","25$"));
        flowers.add(new Flowers(R.drawable.flo5,"Short Lavender","18$"));
        flowers.add(new Flowers(R.drawable.flo1,"Short Green","7$"));
    }
}