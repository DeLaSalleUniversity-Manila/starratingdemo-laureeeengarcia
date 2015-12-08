package com.example.gode_user01.starratingdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout rate;
    private  CheckBox star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rate = (LinearLayout) findViewById(R.id.rating);

        for (int j = 1; j <= 5; j++) {
            star = (CheckBox) rate.findViewWithTag(String.valueOf(j));
            star.setOnClickListener(starsListener);
        }
    }

    private View.OnClickListener starsListener = new View.OnClickListener() {

        public void onClick(View view) {

            int tag = Integer.valueOf((String) view.getTag());
            for (int j = 1; j <= tag; j++) {
                star = (CheckBox) rate.findViewWithTag(String.valueOf(j));
                star.setChecked(true);
            }

            for (int j = tag + 1; j <= 5; j++) {
                star = (CheckBox) rate.findViewWithTag(String.valueOf(j));
                star.setChecked(false);
            }
        }
    };

}