package de.fivespecsdev.schoolapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class AdminAccess extends Activity {

    Button SystemSettings;
    Button Browser;
    Button PlayStore;
    Button Logout;
    Button LockApps;
    Button UnlockApps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_access);

        SystemSettings = (Button) findViewById(R.id.BtnStartSystemSettings);
        Browser = (Button) findViewById(R.id.BtnStartBrowser);
        PlayStore = (Button) findViewById(R.id.BtnStartPlayStore);
        Logout = (Button) findViewById(R.id.BtnAdminOut);
        LockApps = (Button) findViewById(R.id.BtnLockApps);
        UnlockApps = (Button) findViewById(R.id.BtnUnlockApps);

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

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startStart = new Intent(AdminAccess.this, start.class);
                startActivity(startStart);
            }
        });

        LockApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(AdminAccess.this, AppLockerService.class));
            }
        });

        UnlockApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(AdminAccess.this, AppLockerService.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.admin_access, menu);
        return true;
    }

    /*
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
    */
}
