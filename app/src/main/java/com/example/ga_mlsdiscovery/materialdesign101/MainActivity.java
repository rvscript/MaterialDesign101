package com.example.ga_mlsdiscovery.materialdesign101;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
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

    }

    public void showStandAloneToolbar(View view) {
        Intent i = new Intent(this, StandAloneToolbar.class);
        startActivity(i);
    }

    public void showActionBarToolBar(View view) {
        Intent i = new Intent(this, ActionBarToolbar.class);
        startActivity(i);
    }

    public void showContextualMenu(View view) {
        Intent i = new Intent(this, ContextualMenu.class);
        startActivity(i);
    }
}
