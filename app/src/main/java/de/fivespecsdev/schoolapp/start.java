package de.fivespecsdev.schoolapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SpinnerAdapter;


public class start extends Activity implements ActionBar.OnNavigationListener {

    Button StartIPMSG;
    Button AdminAccess;
    Button StartFolder;
    Button StartBook;
    Button StartHomework;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        SpinnerAdapter mSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.Faecher, android.R.layout.simple_spinner_dropdown_item);
        actionBar.setListNavigationCallbacks(mSpinnerAdapter, this);

        StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);
        AdminAccess = (Button) findViewById(R.id.BtnAdminAccess);
        StartFolder = (Button) findViewById(R.id.BtnStartFolder);
        StartBook = (Button) findViewById(R.id.BtnStartBook);
        StartHomework = (Button) findViewById(R.id.BtnStartCal);

        StartIPMSG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openIPMSG = getPackageManager().getLaunchIntentForPackage("com.coderplus.android.ipmsg");
                startActivity(openIPMSG);
            }
        });

        AdminAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPasswordCheck = new Intent(start.this, AdminPasswordCheck.class);
                startActivity(openPasswordCheck);
            }
        });

        StartFolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFolder = getPackageManager().getLaunchIntentForPackage("com.metamoji.noteanytime");
                startActivity(openFolder);
            }
        });

        StartBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openBook = getPackageManager().getLaunchIntentForPackage("air.eu.ydp.bookshelf.gap");
                startActivity(openBook);
            }
        });

        StartHomework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openHomework = getPackageManager().getLaunchIntentForPackage("com.myhomeowork");
                startActivity(openHomework);
            }
        });

    }


    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        switch (itemPosition) {
            case 0:

                break;
            case 1:
                Intent startDeutsch = new Intent(start.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 2:
                Intent startMathe = new Intent(start.this, Mathe.class);
                startActivity(startMathe);
                break;
            case 3:
                Intent startEnglish = new Intent(start.this, English.class);
                startActivity(startEnglish);
                break;
            case 4:
                Intent startBiologie = new Intent(start.this, Biologie.class);
                startActivity(startBiologie);
                break;
            case 5:
                Intent startGeographie = new Intent(start.this, Geographie.class);
                startActivity(startGeographie);
                break;
            case 6:
                Intent startChemie = new Intent(start.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 7:
                Intent startPhysik = new Intent(start.this, Physik.class);
                startActivity(startPhysik);
                break;
            case 8:
                Intent startGeschichte = new Intent(start.this, Geschichte.class);
                startActivity(startGeschichte);
                break;
            case 9:
                Intent startLatein = new Intent(start.this, Latein.class);
                startActivity(startLatein);
                break;
            case 10:
                Intent startFranzoesisch = new Intent(start.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 11:
                Intent startReligion = new Intent(start.this, Religion.class);
                startActivity(startReligion);
                break;
            case 12:
                Intent startMusik = new Intent(start.this, Musik.class);
                startActivity(startMusik);
                break;
            case 13:
                Intent startKunst = new Intent(start.this, Kunst.class);
                startActivity(startKunst);
                break;
            case 14:
                Intent startStart = new Intent(start.this, start.class);
                startActivity(startStart);
                break;


        }
        return false;
    }

    @Override
    public void onBackPressed() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.start, menu);
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
