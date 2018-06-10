package com.senatorfred.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scores = 0;

    public void twoPoints(View view) {
        display(scores + 2);

    }
    public void threePoints(View view) {
        display(scores + 3);

    }
    public void freethrow(View view) {
        display(scores + 1);

    }

    public void twoPointsB(View view) {
        displayB(scores + 2);

    }
    public void threePointsB(View view) {
        displayB(scores + 3);

    }
    public void freethrowB(View view) {
        displayB(scores + 1);

    }
    private void display(int number) {
        TextView opponentA = (TextView) findViewById(R.id.opponentA);
        opponentA.setText(number);
    }

    private void displayB(int number){
        TextView opponentB = (TextView)findViewById(R.id.opponentB);
        opponentB.setText(number);
    }

}