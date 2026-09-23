package com.example.homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // ===== Find the Quick Action buttons by their XML ids =====
        TextView btnAchievements = findViewById(R.id.btnAchievements);
        TextView btnAssessments = findViewById(R.id.btnAssessments);
        TextView btnProgress = findViewById(R.id.btnProgress);
        TextView btnProfile = findViewById(R.id.btnProfile);

        // ===== 1. Achievements button =====
        btnAchievements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AchievementsActivity.class);
                startActivity(intent);
            }
        });

        // ===== 2. Assessments button =====
        btnAssessments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AssessmentsActivity.class);
                startActivity(intent);
            }
        });

        // ===== 3. Progress button =====
        btnProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProgressActivity.class);
                startActivity(intent);
            }
        });

        // ===== 4. Profile button =====
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
