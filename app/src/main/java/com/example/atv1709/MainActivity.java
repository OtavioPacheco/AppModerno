package com.example.atv1709;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    int[] movies = {

            R.drawable.sharknado,

            R.drawable.homem_aranha,

            R.drawable.velocipastor

    };

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerMovies);

        recyclerView.setLayoutManager(

                new LinearLayoutManager(this,

                        LinearLayoutManager.HORIZONTAL,

                        false)

        );

        MovieAdapter adapter = new MovieAdapter(this, movies);

        recyclerView.setAdapter(adapter);

    }

}