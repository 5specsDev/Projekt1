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


public class English extends Activity implements AdapterView.OnItemSelectedListener {

    private Spinner ChClassSpinner;
    Button StartIPMSG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);


        String[] faecher = getResources().getStringArray(R.array.FaecherEnglish);

        ChClassSpinner = (Spinner)findViewById(R.id.ChClassSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(English.this,
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
                Intent startBiologie = new Intent(English.this, Biologie.class);
                startActivity(startBiologie);
                break;
            case 2:
                Intent startGeographie = new Intent(English.this, Geographie.class);
                startActivity(startGeographie);
                break;
            case 3:
                Intent startChemie = new Intent(English.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 4:
                Intent startPhysik = new Intent(English.this, Physik.class);
                startActivity(startPhysik);
                break;
            case 5:
                Intent startGeschichte = new Intent(English.this, Geschichte.class);
                startActivity(startGeschichte);
                break;
            case 6:
                Intent startLatein = new Intent(English.this, Latein.class);
                startActivity(startLatein);
                break;
            case 7:
                Intent startFranzoesisch = new Intent(English.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 8:
                Intent startReligion = new Intent(English.this, Religion.class);
                startActivity(startReligion);
                break;
            case 9:
                Intent startDeutsch = new Intent(English.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 10:
                Intent startMathe = new Intent(English.this, Mathe.class);
                startActivity(startMathe);
                break;
            case 11:
                Intent startStart = new Intent(English.this, start.class);
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
        getMenuInflater().inflate(R.menu.english, menu);
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
