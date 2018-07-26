package com.example.android.footballmatchcounter;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    final int POINTS_FOR_FREE_THROW = 1;
    CountDownTimer x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }

    public void goalForTeamA(View view) {
        TextView score = (TextView) findViewById(R.id.team_a_score);
        int goals = Integer.valueOf(score.getText().toString());
        ++goals;
        displayForTeamA(goals);

    }

    public void foulOnTeamA(View view) {
        TextView score = (TextView) findViewById(R.id.foul_on_team_a);
        int points = Integer.valueOf(score.getText().toString());
        ++points;
        displayFoulsOnTeamA(points);
    }

    public void yellowForTeamA(View view) {
        TextView score = (TextView) findViewById(R.id.yellow_for_team_a);
        int points = Integer.valueOf(score.getText().toString());
        if (points == 11) {
            return;
        }
        ++points;
        displayYellowForTeamA(points);

    }

    public void redForTeamA(View view) {
        TextView score = (TextView) findViewById(R.id.red_for_team_a);
        int points = Integer.valueOf(score.getText().toString());
        if (points == 5) {
            displayForTeamA(0);
            displayForTeamB(0);
            displayFoulsOnTeamA(0);
            displayFoulsOnTeamB(0);
            displayYellowForTeamA(0);
            displayYellowForTeamB(0);
            displayRedForTeamA(0);
            displayRedForTeamB(0);
            return;
        }
        ++points;
        displayRedForTeamA(points);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayFoulsOnTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_on_team_a);
        scoreView.setText(String.valueOf(score));

    }

    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_for_team_a);
        scoreView.setText(String.valueOf(score));

    }

    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_for_team_a);
        scoreView.setText(String.valueOf(score));

    }

    public void goalForTeamB(View view) {
        TextView score = (TextView) findViewById(R.id.team_b_score);
        int goals = Integer.valueOf(score.getText().toString());
        ++goals;
        displayForTeamB(goals);

    }

    public void foulOnTeamB(View view) {
        TextView score = (TextView) findViewById(R.id.foul_on_team_b);
        int points = Integer.valueOf(score.getText().toString());
        ++points;
        displayFoulsOnTeamB(points);
    }

    public void yellowForTeamB(View view) {
        TextView score = (TextView) findViewById(R.id.yellow_for_team_b);
        int points = Integer.valueOf(score.getText().toString());
        if (points == 11) {
            return;
        }
        ++points;
        displayYellowForTeamB(points);

    }

    public void redForTeamB(View view) {
        TextView score = (TextView) findViewById(R.id.red_for_team_b);
        int points = Integer.valueOf(score.getText().toString());
        if (points == 5) {
            displayForTeamA(0);
            displayForTeamB(0);
            displayFoulsOnTeamA(0);
            displayFoulsOnTeamB(0);
            displayYellowForTeamA(0);
            displayYellowForTeamB(0);
            displayRedForTeamA(0);
            displayRedForTeamB(0);
            return;
        }
        ++points;
        displayRedForTeamB(points);

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayFoulsOnTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_on_team_b);
        scoreView.setText(String.valueOf(score));

    }

    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_for_team_b);
        scoreView.setText(String.valueOf(score));

    }

    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_for_team_b);
        scoreView.setText(String.valueOf(score));

    }

    public void reset(View view) {
        displayForTeamA(0);
        displayForTeamB(0);
        displayFoulsOnTeamA(0);
        displayFoulsOnTeamB(0);
        displayYellowForTeamA(0);
        displayYellowForTeamB(0);
        displayRedForTeamA(0);
        displayRedForTeamB(0);
    }


}

