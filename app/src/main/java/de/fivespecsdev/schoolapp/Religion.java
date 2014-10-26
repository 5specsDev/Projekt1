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


public class Religion extends Activity implements AdapterView.OnItemSelectedListener{

    private Spinner ChClassSpinner;
    Button StartIPMSG;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religion);

       StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);

        String[] faecher = getResources().getStringArray(R.array.FaecherReligion);

        ChClassSpinner = (Spinner)findViewById(R.id.ChClassSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Religion.this,
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

                break;
            case 1:
                Intent startDeutsch = new Intent(Religion.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 2:
                Intent startMathe = new Intent(Religion.this, Mathe.class);
                startActivity(startMathe);
                break;
            case 3:
                Intent startEnglish = new Intent(Religion.this, English.class);
                startActivity(startEnglish);
                break;
            case 4:
                Intent startBiologie = new Intent(Religion.this, Biologie.class);
                startActivity(startBiologie);
                break;
            case 5:
                Intent startGeographie = new Intent(Religion.this, Geographie.class);
                startActivity(startGeographie);
                break;
            case 6:
                Intent startChemie = new Intent(Religion.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 7:
                Intent startPhysik = new Intent(Religion.this, Physik.class);
                startActivity(startPhysik);
                break;
            case 8:
                Intent startGeschichte = new Intent(Religion.this, Geschichte.class);
                startActivity(startGeschichte);
                break;
            case 9:
                Intent startLatein = new Intent(Religion.this, Latein.class);
                startActivity(startLatein);
                break;
            case 10:
                Intent startFranzoesisch = new Intent(Religion.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 11:
                Intent startStart = new Intent(Religion.this, start.class);
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
        getMenuInflater().inflate(R.menu.religion, menu);
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
