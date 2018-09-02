package com.example.ga_mlsdiscovery.materialdesign101;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class StandAloneToolbar extends AppCompatActivity {
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stand_alone_toolbar);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("Standalone Toolbar !");
        mToolbar.setSubtitle("by Joe Blo");
        mToolbar.setNavigationIcon(R.drawable.back_button);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //set compatability for the elevation property
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mToolbar.setElevation(10f);
        }

        mToolbar.inflateMenu(R.menu.menu_main);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String title = (String) item.getTitle();
                Toast.makeText(StandAloneToolbar.this, title + " Selected !", Toast.LENGTH_SHORT).show();

                switch (item.getItemId()) {
                    case R.id.save:
                        break;

                    case R.id.settings:
                        break;

                    case R.id.mail:
                        break;

                    case R.id.search:
                        break;

                    case R.id.help:
                        break;

                }

                return true;
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
