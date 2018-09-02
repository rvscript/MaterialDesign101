package com.example.ga_mlsdiscovery.materialdesign101;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ActionBarToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_toolbar);
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

        }
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("ToolBar as ActionBar");
        mToolbar.setSubtitle("by Jane Flo");
        mToolbar.setNavigationIcon(R.drawable.back_button);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = "";
        switch (item.getItemId()) {
            case R.id.save:
                msg = getString(R.string.save);
                break;

            case R.id.settings:
                msg = getString(R.string.settings);
                break;

            case R.id.mail:
                msg = getString(R.string.mail);
                break;

            case R.id.search:
                msg = getString(R.string.search);
                break;

            case R.id.help:
                msg = getString(R.string.help);
                break;
        }

        Toast.makeText(this, msg + " clicked!", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
