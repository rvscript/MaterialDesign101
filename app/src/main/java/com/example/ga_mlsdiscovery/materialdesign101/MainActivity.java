package com.example.ga_mlsdiscovery.materialdesign101;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int wHeight = displayMetrics.heightPixels;
        int wWidth = displayMetrics.widthPixels;

        //check if we're running on Android 5.0 or higher
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

        } else { //Below Lollipop verions 21

        }

        mTextView = findViewById(R.id.tv_text);
        mTextView.setText("window Height = "+wHeight +
                " AND window Width = "+wWidth);

    }
}
