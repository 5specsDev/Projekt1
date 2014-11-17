package de.fivespecsdev.schoolapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;


public class Mathe extends Activity implements ActionBar.OnNavigationListener {

    
    Button StartIPMSG;
    Button StartFolder;
    Button StartBook;
    Button StartHomework;
    Button StartTafel;
    Button StartTaschenrechner;
    Button StartGeoGebra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathe);

        SharedPreferences myPreferences = this.getSharedPreferences("Preferences", MODE_PRIVATE);
        final SharedPreferences.Editor editor = myPreferences.edit();
        editor.putString("LastClass", "Mathe");
        editor.commit();

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        SpinnerAdapter mSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.FaecherMathe, android.R.layout.simple_spinner_dropdown_item);
        actionBar.setListNavigationCallbacks(mSpinnerAdapter, this);

        StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);
        StartFolder = (Button) findViewById(R.id.BtnStartFolder);
        StartBook = (Button) findViewById(R.id.BtnStartBook);
        StartHomework = (Button) findViewById(R.id.BtnStartCal);
        StartTafel = (Button) findViewById(R.id.BtnStartTafel);
        StartTaschenrechner = (Button) findViewById(R.id.BtnStartTR);
        StartGeoGebra = (Button) findViewById(R.id.BtnStartGeoGebra);

        StartIPMSG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openIPMSG = getPackageManager().getLaunchIntentForPackage("com.coderplus.android.ipmsg");
                startActivity(openIPMSG);
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

        StartTafel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openTafel = getPackageManager().getLaunchIntentForPackage("com.cornelsen.formelsammlung");
                startActivity(openTafel);
            }
        });

        StartTaschenrechner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openTaschenrechner = getPackageManager().getLaunchIntentForPackage("com.mathsapp.graphing");
                startActivity(openTaschenrechner);
            }
        });

        StartGeoGebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openGeogebra = getPackageManager().getLaunchIntentForPackage("org.geogebra");
                startActivity(openGeogebra);
            }
        });
    }



    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        switch (itemPosition) {
            case 0:

                break;
            case 1:
                Intent startDeutsch = new Intent(Mathe.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 2:
                Intent startMathe = new Intent(Mathe.this, Mathe.class);
                startActivity(startMathe);
                break;
            case 3:
                Intent startEnglish = new Intent(Mathe.this, English.class);
                startActivity(startEnglish);
                break;
            case 4:
                Intent startBiologie = new Intent(Mathe.this, Biologie.class);
                startActivity(startBiologie);
                break;
            case 5:
                Intent startGeographie = new Intent(Mathe.this, Geographie.class);
                startActivity(startGeographie);
                break;
            case 6:
                Intent startChemie = new Intent(Mathe.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 7:
                Intent startPhysik = new Intent(Mathe.this, Physik.class);
                startActivity(startPhysik);
                break;
            case 8:
                Intent startGeschichte = new Intent(Mathe.this, Geschichte.class);
                startActivity(startGeschichte);
                break;
            case 9:
                Intent startLatein = new Intent(Mathe.this, Latein.class);
                startActivity(startLatein);
                break;
            case 10:
                Intent startFranzoesisch = new Intent(Mathe.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 11:
                Intent startReligion = new Intent(Mathe.this, Religion.class);
                startActivity(startReligion);
                break;
            case 12:
                Intent startMusik = new Intent(Mathe.this, Musik.class);
                startActivity(startMusik);
                break;
            case 13:
                Intent startKunst = new Intent(Mathe.this, Kunst.class);
                startActivity(startKunst);
                break;
            case 14:
                SharedPreferences myPreferences = this.getSharedPreferences("Preferences", MODE_PRIVATE);
                final SharedPreferences.Editor editor = myPreferences.edit();
                editor.putString("LastClass", "Start");
                editor.commit();
                Intent startStart = new Intent(Mathe.this, start.class);
                startActivity(startStart);
                break;


        }
        return false;
    }


    @Override
    public void onResume() {
        SharedPreferences myPreferences = this.getSharedPreferences("Preferences", MODE_PRIVATE);
        final SharedPreferences.Editor editor = myPreferences.edit();
        editor.putString("LastClass", "Mathe");
        editor.commit();
        super.onResume();
    }

    @Override
    public void onBackPressed() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mathe, menu);
        return true;
    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}
