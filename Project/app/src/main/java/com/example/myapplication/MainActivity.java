package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;
    List<Categorie> category1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        category1 = new ArrayList<>();
        category1.add(new Categorie("Nissan Silvia S15", "ABS", "Method", "Wow", R.drawable.silvias15));
        category1.add(new Categorie("Toyota AE86", "ABS", "Method", "Wow", R.drawable.ae86));
        category1.add(new Categorie("Nissan Skyline Concept", "ABS", "Method", "Wow", R.drawable.concept));
        category1.add(new Categorie("Nissan GT-R", "ABS", "Method", "Wow", R.drawable.gtr));
        category1.add(new Categorie("Toyota Supra", "ABS", "Method", "Wow", R.drawable.supra));

        myrecyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this,category1);
        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        myrecyclerView.setAdapter(myAdapter);
    }
}