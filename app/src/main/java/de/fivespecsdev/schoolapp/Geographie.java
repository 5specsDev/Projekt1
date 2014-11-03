package de.fivespecsdev.schoolapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class Geographie extends Activity implements AdapterView.OnItemSelectedListener{

    private Spinner ChClassSpinner;
    Button StartIPMSG;
    Button StartFolder;
    Button StartBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geographie);

        StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);
        StartFolder = (Button) findViewById(R.id.BtnStartFolder);
        StartBook = (Button)findViewById(R.id.BtnStartBook);


        String[] faecher = getResources().getStringArray(R.array.FaecherGeographie);

        ChClassSpinner = (Spinner)findViewById(R.id.ChClassSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Geographie.this,
                android.R.layout.simple_spinner_item, faecher);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ChClassSpinner.setAdapter(adapter);
        ChClassSpinner.setOnItemSelectedListener(this);

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
                Intent openBook = getPackageManager().getLaunchIntentForPackage("com.adobe.reader");
                startActivity(openBook);
            }
        });


    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                //
                break;
            case 1:
                Intent startChemie = new Intent(Geographie.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 2:
                Intent startPhysik = new Intent(Geographie.this, Physik.class);
                startActivity(startPhysik);
                break;
            case 3:
                Intent startGeschichte = new Intent(Geographie.this, Geschichte.class);
                startActivity(startGeschichte);
                break;
            case 4:
                Intent startLatein = new Intent(Geographie.this, Latein.class);
                startActivity(startLatein);
                break;
            case 5:
                Intent startFranzoesisch = new Intent(Geographie.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 6:
                Intent startReligion = new Intent(Geographie.this, Religion.class);
                startActivity(startReligion);
                break;
            case 7:
                Intent startDeutsch = new Intent(Geographie.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 8:
                Intent startMathe = new Intent(Geographie.this, Mathe.class);
                startActivity(startMathe);
                break;
            case 9:
                Intent startEnglish = new Intent(Geographie.this, English.class);
                startActivity(startEnglish);
                break;
            case 10:
                Intent startBiologie = new Intent(Geographie.this, Biologie.class);
                startActivity(startBiologie);
                break;
            case 11:
                Intent startStart = new Intent(Geographie.this, start.class);
                startActivity(startStart);
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onBackPressed() {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.geographie, menu);
        return true;
    }

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
}
