package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {

        TextView home_bar=(TextView) findViewById(R.id.home_bar);
        TextView month_bar=(TextView) findViewById(R.id.month_bar);
        TextView week_bar=(TextView) findViewById(R.id.week_bar);
        TextView day_bar=(TextView) findViewById(R.id.day_bar);
        TextView memo_bar=(TextView) findViewById(R.id.memo_bar);
        TextView pen_bar=(TextView) findViewById(R.id.pen_bar);

        home_bar.setVisibility(View.INVISIBLE);
        month_bar.setVisibility(View.INVISIBLE);
        week_bar.setVisibility(View.INVISIBLE);
        day_bar.setVisibility(View.INVISIBLE);
        memo_bar.setVisibility(View.INVISIBLE);
        pen_bar.setVisibility(View.INVISIBLE);

        switch (v.getId()){
            case R.id.home:
                home_bar.setVisibility(View.VISIBLE);
                break;
            case R.id.month:
                month_bar.setVisibility(View.VISIBLE);
                break;
            case R.id.week:
                week_bar.setVisibility(View.VISIBLE);
                break;
            case R.id.day:
                day_bar.setVisibility(View.VISIBLE);
                break;
            case R.id.memo:
                memo_bar.setVisibility(View.VISIBLE);
                break;
            case R.id.pen:
                pen_bar.setVisibility(View.VISIBLE);
                break;
        }
    }

}