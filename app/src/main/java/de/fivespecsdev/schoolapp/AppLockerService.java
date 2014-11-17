package de.fivespecsdev.schoolapp;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;


public class AppLockerService extends Service {
    public AppLockerService() {
    }

    String[] blacklistedApps = {"com.android.settings", "com.android.browser", "com.vlingo.midas", "com.google.android.googlequicksearchbox",
                                "com.sec.chaton", "com.sec.android.app.samsungapps", "com.android.vending", "com.google.android.youtube",
                                "com.android.chrome","com.android.email", "com.sec.android.apps.gamehub", "com.google.android.gm",
                                "com.google.android.play.games", "com.sec.android.apps.launcher"};

    TimerTask mTimerTask;


    @Override
    public void onCreate() {

        Toast.makeText(getApplicationContext(), "Apps gesperrt!", Toast.LENGTH_SHORT).show();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(mTimerTask = new TimerTask() {
            public void run() {

                ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
                final ActivityManager.RunningTaskInfo top = am.getRunningTasks(1).get(0);
                final String packageName = top.topActivity.getPackageName();

                if (Arrays.asList(blacklistedApps).contains(packageName)) {

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
        mTimerTask.cancel();
        Toast.makeText(getApplicationContext(), "Apps entsperrt!", Toast.LENGTH_SHORT).show();
        
    }


}
