package de.fivespecsdev.schoolapp;

import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AppLockerService extends Service {
    public AppLockerService() {
    }

    String whitelistedApp1 = "de.fivespecsdev.schoolapp";
    String whitelistedApp2 = "com.coderplus.android.ipmsg";
    String whitelistedApp3 = "com.metamoji.noteanytime";
    String whitelistedApp4 = "air.eu.ydp.bookshelf.gap";
    String whitelistedApp5 = "com.myhomeowork";
    String whitelistedApp6 = "com.sirma.mobile.bible.android";
    String whitelistedApp7 = "com.cornelsen.formelsammlung";
    String whitelistedApp8 = "com.mathsapp.graphing";
    String whitelistedApp9 = "org.geogebra";
    String whitelistedApp10 = "air.com.adobe.pstouch.oem1";
    String whitelistedApp11 = "com.google.earth";
    String whitelistedApp12 = "org.leo.android.dict";
    String whitelistedApp13 = "livio.pack.lang.de_DE";
    String whitelistedApp14 = "org.hudsonalpha.icell";






    @Override
    public void onCreate() {

        Toast.makeText(getApplicationContext(), "Apps gesperrt!", Toast.LENGTH_SHORT).show();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {




                ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
                final ActivityManager.RunningTaskInfo top = am.getRunningTasks(1).get(0);
                final String packageName = top.topActivity.getPackageName();



                if (packageName.equals(whitelistedApp1) || packageName.equals(whitelistedApp2) || packageName.equals(whitelistedApp3) || packageName.equals(whitelistedApp4) || packageName.equals(whitelistedApp5) ||
                        packageName.equals(whitelistedApp6) || packageName.equals(whitelistedApp7) || packageName.equals(whitelistedApp8) || packageName.equals(whitelistedApp9) || packageName.equals(whitelistedApp10) ||
                        packageName.equals(whitelistedApp11) || packageName.equals(whitelistedApp12) || packageName.equals(whitelistedApp13) || packageName.equals(whitelistedApp14) ) {}


                else {


                    Intent launchIntent = new Intent(getBaseContext(), ForbiddenApp.class);
                    launchIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getApplication().startActivity(launchIntent);

                }




            }
        }, 0, 1000);

    }








    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Apps entsperrt! (funktioniert noch nicht!)", Toast.LENGTH_SHORT).show();
    }


}
