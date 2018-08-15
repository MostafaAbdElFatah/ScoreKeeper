package com.mostafa.fci.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    private void displayForTeamA(int points) {
        TextView scoreViewOfTeamA = findViewById(R.id.team_a_score);
        scoreViewOfTeamA.setText( String.valueOf(points) );

    }
    private void displayForTeamB(int points) {
        TextView scoreViewOfTeamB = findViewById(R.id.team_b_score);
        scoreViewOfTeamB.setText( String.valueOf(points) );
    }

    public void resetScoreOfAll(View view) {
        TextView scoreViewOfTeamA = findViewById(R.id.team_a_score);
        TextView scoreViewOfTeamB = findViewById(R.id.team_b_score);
        scoreViewOfTeamA.setText("0");
        scoreViewOfTeamB.setText("0");
        scoreTeamA = 0;
        scoreTeamB = 0;
    }
}
