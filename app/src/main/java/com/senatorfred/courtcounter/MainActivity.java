package com.senatorfred.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView opponentA;
    private TextView opponentB;
    private int scores, scoresA = 0;
    public int resetAll = 0;
    public int resetAllB = 0;
    private String resetAllNew = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        opponentA = (TextView) findViewById(R.id.opponentA);
        opponentB = (TextView)findViewById(R.id.opponentB);
    }

//     int scores = 0;

    public void twoPoints(View view) {
        scores = scores + 2;
        display(scores);


    }
    public void threePoints(View view) {
        scores = scores + 3;
        display(scores);

    }
    public void freethrow(View view) {
        scores  = scores + 1;
        display(scores);

    }

    public void twoPointsB(View view) {
        scoresA = scoresA + 2;
      displayB(scoresA);

    }
    public void threePointsB(View view) {
        scoresA = scoresA + 3;
        displayB(scoresA);

    }
    public void freethrowB(View view) {
        scoresA = scoresA + 1;
        displayB(scoresA);

    }
    public void resetAllScores(View view){
        resetAll = 0;
        scores = 0;

    /*    resetAllNew = null;
        resetAllNew = "0";

        int _check = Integer.valueOf(resetAllNew);

        */

        display(resetAll);

    }
    public void resetAllScoresB(View view){
        resetAllB = 0;
        scoresA = 0;

        displayB(resetAllB);

    }
    private void display(int number) {

        opponentA.setText(String.valueOf(number));
    }

    private void displayB(int number){

        opponentB.setText(String.valueOf(number));
    }

}