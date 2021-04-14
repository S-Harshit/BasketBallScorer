package com.example.basketballscorer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA_score = 0;
    int teamB_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThreeforA(View view) {
        teamA_score += 3;
        displayForTeamA(teamA_score);
    }
    public void plusThreeforB(View view) {
        teamB_score += 3;
        displayForTeamB(teamB_score);
    }

    public void plusTwoforA(View view) {
        teamA_score += 2;
        displayForTeamA(teamA_score);
    }

    public void plusTwoforB(View view) {
        teamB_score += 2;
        displayForTeamB(teamB_score);
    }

    public void plusOneforA(View view) {
        teamA_score += 1;
        displayForTeamA(teamA_score);
    }


    public void plusOneforB(View view) {
        teamB_score += 1;
        displayForTeamB(teamB_score);
    }
    public void reset(View view) {
        teamA_score = 0;
        teamB_score = 0;
        displayForTeamA(teamA_score);
        displayForTeamB(teamB_score);
    }

    private void displayForTeamA(int score) {
        TextView obj = findViewById(R.id.score_text_view);
        obj.setText(String.valueOf(score));
    }


    private void displayForTeamB(int score) {
        TextView obj = findViewById(R.id.scoreb_text_view);
        obj.setText(String.valueOf(score));
    }



}