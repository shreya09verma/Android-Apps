package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalPointsA=0;
    int totalPointsB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(921);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threePointA(View view)
    {
        totalPointsA=totalPointsA+3;
        displayForTeamA(totalPointsA);
    }
    public void twoPointA(View view)
    {
        totalPointsA=totalPointsA+2;
        displayForTeamA(totalPointsA);
    }
    public void onePointA(View view)
    {
        totalPointsA=totalPointsA+1;
        displayForTeamA(totalPointsA);
    }
    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }
    public void threePointB(View view)
    {
        totalPointsB=totalPointsB+3;
        displayForTeamB(totalPointsB);
    }
    public void twoPointB(View view)
    {
        totalPointsB=totalPointsB+2;
        displayForTeamB(totalPointsB);
    }
    public void onePointB(View view)
    {
        totalPointsB=totalPointsB+1;
        displayForTeamB(totalPointsB);
    }
    public void reset(View view)
    {
        totalPointsA=0;
        totalPointsB=0;
        displayForTeamA(totalPointsA);
        displayForTeamB(totalPointsB);
    }
}
