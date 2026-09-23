package com.example.homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ===== Find the Quick Action cards by their XML ids =====
        CardView btnFavorites = findViewById(R.id.btnFavorites);
        CardView btnNewReleases = findViewById(R.id.btnNewReleases);
        CardView btnBookmarks = findViewById(R.id.btnBookmarks);
        CardView btnProfile = findViewById(R.id.btnProfile);

        // ===== 1. Favorites button =====
        btnFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(intent);
            }
        });

        // ===== 2. New Releases button =====
        btnNewReleases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewReleasesActivity.class);
                startActivity(intent);
            }
        });

        // ===== 3. Bookmarks button =====
        btnBookmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BookmarksActivity.class);
                startActivity(intent);
            }
        });

        // ===== 4. Profile button =====
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
