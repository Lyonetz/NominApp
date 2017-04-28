package com.example.carlos.nominapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private TextView tvSalarioBase;
    private EditText etSalarioBase;

    private CheckBox cbAntiguedad;
    private EditText etAntiguedad;
    private TextView tvAntiguedad;

    private CheckBox cbConvenio;
    private EditText etConvenio;
    private TextView tvConvenio;

    private CheckBox cbTransporte;
    private EditText etTransporte;
    private TextView tvTransporte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSalarioBase = (TextView) findViewById(R.id.tvSalarioBase);
        etSalarioBase = (EditText) findViewById(R.id.etSalarioBase);

        cbAntiguedad = (CheckBox) findViewById(R.id.cbAntiguedad);
        etAntiguedad = (EditText) findViewById(R.id.etAntiguedad);
        tvAntiguedad = (TextView) findViewById(R.id.tvAntiguedad);

        cbConvenio = (CheckBox) findViewById(R.id.cbConvenio);
        etConvenio = (EditText) findViewById(R.id.etConvenio);
        tvConvenio = (TextView) findViewById(R.id.tvConvenio);

        cbTransporte = (CheckBox) findViewById(R.id.cbTransporte);
        etTransporte = (EditText) findViewById(R.id.etTransporte);
        tvTransporte = (TextView) findViewById(R.id.tvTransporte);

        final Map<CheckBox, EditText> checkBoxEditTextMap = new HashMap<>();
        checkBoxEditTextMap.put(cbAntiguedad, etAntiguedad);
        checkBoxEditTextMap.put(cbConvenio, etConvenio);
        checkBoxEditTextMap.put(cbTransporte, etTransporte);

        final Map<CheckBox, TextView> checkBoxTextViewMap = new HashMap<>();
        checkBoxTextViewMap.put(cbAntiguedad,tvAntiguedad);
        checkBoxTextViewMap.put(cbConvenio, tvConvenio);
        checkBoxTextViewMap.put(cbTransporte, tvTransporte);

        if(!cbAntiguedad.isChecked()) {
            etAntiguedad.setVisibility(View.INVISIBLE);
            tvAntiguedad.setVisibility(View.INVISIBLE);
        }

        if(!cbConvenio.isChecked()) {
            etConvenio.setVisibility(View.INVISIBLE);
            tvConvenio.setVisibility(View.INVISIBLE);
        }

        if(!cbTransporte.isChecked()) {
            etTransporte.setVisibility(View.INVISIBLE);
            tvTransporte.setVisibility(View.INVISIBLE);
        }


        CheckBox.OnClickListener cbListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb = (CheckBox) v;

                if (cb.isChecked()) {
                    checkBoxEditTextMap.get(cb).setVisibility(View.VISIBLE);
                    checkBoxTextViewMap.get(cb).setVisibility(View.VISIBLE);
                } else {
                    checkBoxEditTextMap.get(cb).setText(null);
                    checkBoxEditTextMap.get(cb).setVisibility(View.INVISIBLE);
                    checkBoxTextViewMap.get(cb).setVisibility(View.INVISIBLE);
                }
            }
        };

        cbAntiguedad.setOnClickListener(cbListener);
        cbConvenio.setOnClickListener(cbListener);
        cbTransporte.setOnClickListener(cbListener);




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