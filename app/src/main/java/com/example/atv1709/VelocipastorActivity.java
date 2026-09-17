package com.example.atv1709;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class VelocipastorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_velocipastor);

        MaterialButton btnTrailer = findViewById(
                R.id.btnTrailer
        );

        btnTrailer.setOnClickListener(v -> {
            String trailerUrl =
                    "https://www.youtube.com/watch?v=JppwKpfOgyo";
            Intent intent = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(trailerUrl)
            );

            startActivity(intent);
        });
    }
}