package de.fivespecsdev.schoolapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AdminPasswordCheck extends Activity {

    Button CheckPswd;
    EditText EditTxtPassword;
    TextView WrongPswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_password_check);

        CheckPswd = (Button) findViewById(R.id.BtnCheckPswd);
        EditTxtPassword = (EditText) findViewById(R.id.EditTxtPassword);
        WrongPswd = (TextView) findViewById(R.id.TxtViewWrongPswd);
        final String Passwort = "20semi14";

        CheckPswd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Eingabe = EditTxtPassword.getText().toString();
                if (Eingabe.equals( Passwort )) {
                    Intent openAdminAccess = new Intent(AdminPasswordCheck.this, AdminAccess.class);
                    startActivity(openAdminAccess); }
                else {
                    WrongPswd.setText("Falsches Passwort");
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.admin_password_check, menu);
        return true;
    }

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
}
