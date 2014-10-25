package de.fivespecsdev.schoolapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class AdminAccess extends Activity {

    Button SystemSettings;
    Button Browser;
    Button PlayStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_access);

        SystemSettings = (Button) findViewById(R.id.BtnStartSystemSettings);
        Browser = (Button) findViewById(R.id.BtnStartBrowser);
        PlayStore = (Button) findViewById(R.id.BtnStartPlayStore);

        SystemSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openSystemSettings = getPackageManager().getLaunchIntentForPackage("com.android.settings");
                startActivity(openSystemSettings);
            }
        });

        Browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openBrowser = getPackageManager().getLaunchIntentForPackage("com.android.browser");
                startActivity(openBrowser);
            }
        });

        PlayStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPlayStore = getPackageManager().getLaunchIntentForPackage("com.android.vending");
                startActivity(openPlayStore);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.admin_access, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
