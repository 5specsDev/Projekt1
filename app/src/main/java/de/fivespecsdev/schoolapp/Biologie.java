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


public class Biologie extends Activity implements AdapterView.OnItemSelectedListener {

    private Spinner ChClassSpinner;
    Button StartIPMSG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biologie);

        StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);


        String[] faecher = getResources().getStringArray(R.array.FaecherBiologie);

        ChClassSpinner = (Spinner)findViewById(R.id.ChClassSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Biologie.this,
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


    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                //
                break;
            case 1:
                Intent startGeograhie = new Intent(Biologie.this, Geographie.class);
                startActivity(startGeograhie);
                break;
            case 2:
                Intent startChemie = new Intent(Biologie.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 3:
                Intent startPhysik = new Intent(Biologie.this, Physik.class);
                startActivity(startPhysik);
                break;
            case 4:
                Intent startGeschichte = new Intent(Biologie.this, Geschichte.class);
                startActivity(startGeschichte);
                break;
            case 5:
                Intent startLatein = new Intent(Biologie.this, Latein.class);
                startActivity(startLatein);
                break;
            case 6:
                Intent startFranzoesisch = new Intent(Biologie.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 7:
                Intent startReligion = new Intent(Biologie.this, Religion.class);
                startActivity(startReligion);
                break;
            case 8:
                Intent startDeutsch = new Intent(Biologie.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 9:
                Intent startMathe = new Intent(Biologie.this, Mathe.class);
                startActivity(startMathe);
                break;
            case 10:
                Intent startEnglish = new Intent(Biologie.this, English.class);
                startActivity(startEnglish);
                break;
            case 11:
                Intent startStart = new Intent(Biologie.this, start.class);
                startActivity(startStart);
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.biologie, menu);
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
