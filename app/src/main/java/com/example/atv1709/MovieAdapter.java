package com.example.atv1709;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private int[] movieImages;
    private Context context;

    public MovieAdapter(Context context, int[] movieImages) {

        this.context = context;
        this.movieImages = movieImages;

    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_movie, parent, false);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull MovieViewHolder holder,
            int position) {

        // Coloca a imagem do filme
        holder.imgMovie.setImageResource(movieImages[position]);

        // Detecta o clique no filme
        holder.itemView.setOnClickListener(v -> {

            // VelociPastor
            if (movieImages[position] == R.drawable.velocipastor) {

                Intent intent = new Intent(
                        context,
                        VelocipastorActivity.class
                );

                context.startActivity(intent);
            }

        });
    }

    @Override
    public int getItemCount() {
        return movieImages.length;
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMovie;

        public MovieViewHolder(@NonNull View itemView) {

            super(itemView);

            imgMovie = itemView.findViewById(R.id.imgMovie);
        }
    }
}

