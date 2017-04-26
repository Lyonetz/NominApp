package com.example.carlos.nominapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvSalarioBase;
    private EditText etSalarioBase;
    private CheckBox cbAntiguedad;
    private EditText etAntiguedad;
    private TextView tvEuroAntiguedad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvSalarioBase = (TextView) findViewById(R.id.tvSalarioBase);
        etSalarioBase = (EditText) findViewById(R.id.etSalarioBase);
        cbAntiguedad = (CheckBox) findViewById(R.id.cbAntiguedad);
        etAntiguedad = (EditText) findViewById(R.id.etAntiguedad);
        tvEuroAntiguedad = (TextView) findViewById(R.id.tvEuroAntiguedad);
        if(!cbAntiguedad.isChecked()) {
            etAntiguedad.setVisibility(View.INVISIBLE);
            tvEuroAntiguedad.setVisibility(View.INVISIBLE);
        }

        CheckBox.OnClickListener cbListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v;
                if (cb.isChecked()) {
                    etAntiguedad.setVisibility(View.VISIBLE);
                    tvEuroAntiguedad.setVisibility(View.VISIBLE);
                } else {
                    etAntiguedad.setText(null);
                    etAntiguedad.setVisibility(View.INVISIBLE);
                    tvEuroAntiguedad.setVisibility(View.INVISIBLE);
                }
            }
        };

        cbAntiguedad.setOnClickListener(cbListener);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
