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


public class Franzoesisch extends Activity implements ActionBar.OnNavigationListener {

   
    Button StartIPMSG;
    Button StartFolder;
    Button StartBook;
    Button StartHomework;
    Button StartWörterbuchFranzoesisch;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franzoesisch);

        SharedPreferences myPreferences = this.getSharedPreferences("Preferences", MODE_PRIVATE);
        final SharedPreferences.Editor editor = myPreferences.edit();
        editor.putString("LastClass", "Franzoesisch");
        editor.commit();

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        SpinnerAdapter mSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.FaecherFranz, android.R.layout.simple_spinner_dropdown_item);
        actionBar.setListNavigationCallbacks(mSpinnerAdapter, this);

        StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);
        StartFolder = (Button) findViewById(R.id.BtnStartFolder);
        StartBook = (Button) findViewById(R.id.BtnStartBook);
        StartHomework = (Button) findViewById(R.id.BtnStartCal);
        StartWörterbuchFranzoesisch = (Button) findViewById(R.id.BtnStartWBuchFranz);

        /*
        StartIPMSG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openIPMSG = getPackageManager().getLaunchIntentForPackage("com.coderplus.android.ipmsg");
                startActivity(openIPMSG);
            }
        });
        */


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
        StartWörterbuchFranzoesisch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFraWBuch = getPackageManager().getLaunchIntentForPackage("org.leo.android.dict");
                startActivity(openFraWBuch);
            }
        });
    }



    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        switch (itemPosition) {
            case 0:

                break;
            case 1:
                Intent startDeutsch = new Intent(Franzoesisch.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 2:
                Intent startMathe = new Intent(Franzoesisch.this, Mathe.class);
                startActivity(startMathe);
                break;
            case 3:
                Intent startEnglish = new Intent(Franzoesisch.this, English.class);
                startActivity(startEnglish);
                break;
            case 4:
                Intent startBiologie = new Intent(Franzoesisch.this, Biologie.class);
                startActivity(startBiologie);
                break;
            case 5:
                Intent startGeographie = new Intent(Franzoesisch.this, Geographie.class);
                startActivity(startGeographie);
                break;
            case 6:
                Intent startChemie = new Intent(Franzoesisch.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 7:
                Intent startPhysik = new Intent(Franzoesisch.this, Physik.class);
                startActivity(startPhysik);
                break;
            case 8:
                Intent startGeschichte = new Intent(Franzoesisch.this, Geschichte.class);
                startActivity(startGeschichte);
                break;
            case 9:
                Intent startLatein = new Intent(Franzoesisch.this, Latein.class);
                startActivity(startLatein);
                break;
            case 10:
                Intent startFranzoesisch = new Intent(Franzoesisch.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 11:
                Intent startReligion = new Intent(Franzoesisch.this, Religion.class);
                startActivity(startReligion);
                break;
            case 12:
                Intent startMusik = new Intent(Franzoesisch.this, Musik.class);
                startActivity(startMusik);
                break;
            case 13:
                Intent startKunst = new Intent(Franzoesisch.this, Kunst.class);
                startActivity(startKunst);
                break;
            case 14:
                SharedPreferences myPreferences = this.getSharedPreferences("Preferences", MODE_PRIVATE);
                final SharedPreferences.Editor editor = myPreferences.edit();
                editor.putString("LastClass", "Start");
                editor.commit();
                Intent startStart = new Intent(Franzoesisch.this, start.class);
                startActivity(startStart);
                break;


        }
        return false;
    }


    @Override
    public void onResume() {
        SharedPreferences myPreferences = this.getSharedPreferences("Preferences", MODE_PRIVATE);
        final SharedPreferences.Editor editor = myPreferences.edit();
        editor.putString("LastClass", "Franzoesisch");
        editor.commit();
        super.onResume();
    }

    @Override
    public void onBackPressed() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.franzoesisch, menu);
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
