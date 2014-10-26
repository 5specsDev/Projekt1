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


public class Geschichte extends Activity implements AdapterView.OnItemSelectedListener{

    private Spinner ChClassSpinner;
    Button StartIPMSG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geschichte);
        StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);

        String[] faecher = getResources().getStringArray(R.array.FaecherGeschichte);

        ChClassSpinner = (Spinner)findViewById(R.id.ChClassSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Geschichte.this,
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
                Intent startLatein = new Intent(Geschichte.this, Latein.class);
                startActivity(startLatein);
                break;
            case 2:
                Intent startFranzoesisch = new Intent(Geschichte.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 3:
                Intent startReligion = new Intent(Geschichte.this, Religion.class);
                startActivity(startReligion);
                break;
            case 4:
                Intent startDeutsch = new Intent(Geschichte.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 5:
                Intent startMathe = new Intent(Geschichte.this, Mathe.class);
                startActivity(startMathe);
                break;
            case 6:
                Intent startEnglish = new Intent(Geschichte.this, English.class);
                startActivity(startEnglish);
                break;
            case 7:
                Intent startBiologie = new Intent(Geschichte.this, Biologie.class);
                startActivity(startBiologie);
                break;
            case 8:
                Intent startGeographie = new Intent(Geschichte.this, Geographie.class);
                startActivity(startGeographie);
                break;
            case 9:
                Intent startChemie = new Intent(Geschichte.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 10:
                Intent startPhysik = new Intent(Geschichte.this, Physik.class);
                startActivity(startPhysik);
                break;
            case 11:
                Intent startStart = new Intent(Geschichte.this, start.class);
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
        getMenuInflater().inflate(R.menu.geschichte, menu);
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
