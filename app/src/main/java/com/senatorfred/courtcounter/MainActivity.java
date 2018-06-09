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

    public void twoPoints(View view){
        int twoPnts = 2;

    }
}
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreTeamA);
        quantityTextView.setText("" + number);