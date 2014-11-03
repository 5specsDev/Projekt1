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


public class Mathe extends Activity implements AdapterView.OnItemSelectedListener {

    private Spinner ChClassSpinner;
    Button StartIPMSG;
    Button StartFolder;
    Button StartBook;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathe);

        StartIPMSG = (Button) findViewById(R.id.BtnStartIPMSG);
        StartFolder = (Button) findViewById(R.id.BtnStartFolder);
        StartBook = (Button) findViewById(R.id.BtnStartBook);

        String[] faecher = getResources().getStringArray(R.array.FaecherMathe);

        ChClassSpinner = (Spinner)findViewById(R.id.ChClassSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Mathe.this,
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
                Intent startEnglish = new Intent(Mathe.this, English.class);
                startActivity(startEnglish);
                break;
            case 2:
                Intent startBiologie = new Intent(Mathe.this, Biologie.class);
                startActivity(startBiologie);
                break;
            case 3:
                Intent startGeographie = new Intent(Mathe.this, Geographie.class);
                startActivity(startGeographie);
                break;
            case 4:
                Intent startChemie = new Intent(Mathe.this, Chemie.class);
                startActivity(startChemie);
                break;
            case 5:
                Intent startPhysik = new Intent(Mathe.this, Physik.class);
                startActivity(startPhysik);
                break;
            case 6:
                Intent startGeschichte = new Intent(Mathe.this, Geschichte.class);
                startActivity(startGeschichte);
                break;
            case 7:
                Intent startLatein = new Intent(Mathe.this, Latein.class);
                startActivity(startLatein);
                break;
            case 8:
                Intent startFranzoesisch = new Intent(Mathe.this, Franzoesisch.class);
                startActivity(startFranzoesisch);
                break;
            case 9:
                Intent startReligion = new Intent(Mathe.this, Religion.class);
                startActivity(startReligion);
                break;
            case 10:
                Intent startDeutsch = new Intent(Mathe.this, Deutsch.class);
                startActivity(startDeutsch);
                break;
            case 11:
                Intent startStart = new Intent(Mathe.this, start.class);
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
        getMenuInflater().inflate(R.menu.mathe, menu);
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
