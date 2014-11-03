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


public class Physik extends Activity implements AdapterView.OnItemSelectedListener {

    private Spinner ChClassSpinner;
    Button StartIPMSG;
    Button StartFolder;
    Button StartBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physik);

        StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);
        StartFolder = (Button) findViewById(R.id.BtnStartFolder);
        StartBook = (Button) findViewById(R.id.BtnStartBook);

        String[] faecher = getResources().getStringArray(R.array.FaecherPhysik);

        ChClassSpinner = (Spinner)findViewById(R.id.ChClassSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Physik.this,
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

                break;
            case 1:
                Intent startGeschichte = new Intent(Physik.this, Geschichte.class);
                startActivity(startGeschichte);
                break;
            case 2:
                Intent startLatein = new Intent(Physik.this, Latein.class);
                startActivity(startLatein);
                break;
            case 3:
                Intent startFranzoesisch = new Intent(Physik.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 4:
                Intent startReligion = new Intent(Physik.this, Religion.class);
                startActivity(startReligion);
                break;
            case 5:
                Intent startDeutsch = new Intent(Physik.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 6:
                Intent startMathe = new Intent(Physik.this, Mathe.class);
                startActivity(startMathe);
                break;
            case 7:
                Intent startEnglish = new Intent(Physik.this, English.class);
                startActivity(startEnglish);
                break;
            case 8:
                Intent startBiologie = new Intent(Physik.this, Biologie.class);
                startActivity(startBiologie);
                break;
            case 9:
                Intent startGeographie = new Intent(Physik.this, Geographie.class);
                startActivity(startGeographie);
                break;
            case 10:
                Intent startChemie = new Intent(Physik.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 11:
                Intent startStart = new Intent(Physik.this, start.class);
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
        getMenuInflater().inflate(R.menu.physik, menu);
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
