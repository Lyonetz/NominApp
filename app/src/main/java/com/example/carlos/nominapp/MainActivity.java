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

    private CheckBox cbPeligrosidad;
    private EditText etPeligrosidad;
    private TextView tvPeligrosidad;

    private CheckBox cbQuebranto;
    private EditText etQuebranto;
    private TextView tvQuebranto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSalarioBase = (TextView) findViewById(R.id.tvSalarioBase);
        etSalarioBase = (EditText) findViewById(R.id.etSalarioBase);

        cbAntiguedad = (CheckBox) findViewById(R.id.cbAntiguedad);
        etAntiguedad = (EditText) findViewById(R.id.etAntiguedad);
        etAntiguedad.setVisibility(View.INVISIBLE);
        tvAntiguedad = (TextView) findViewById(R.id.tvAntiguedad);
        tvAntiguedad.setVisibility(View.INVISIBLE);

        cbConvenio = (CheckBox) findViewById(R.id.cbConvenio);
        etConvenio = (EditText) findViewById(R.id.etConvenio);
        etConvenio.setVisibility(View.INVISIBLE);
        tvConvenio = (TextView) findViewById(R.id.tvConvenio);
        tvConvenio.setVisibility(View.INVISIBLE);

        cbTransporte = (CheckBox) findViewById(R.id.cbTransporte);
        etTransporte = (EditText) findViewById(R.id.etTransporte);
        etTransporte.setVisibility(View.INVISIBLE);
        tvTransporte = (TextView) findViewById(R.id.tvTransporte);
        tvTransporte.setVisibility(View.INVISIBLE);

        cbPeligrosidad = (CheckBox) findViewById(R.id.cbPeligrosidad);
        etPeligrosidad = (EditText) findViewById(R.id.etPeligrosidad);
        etPeligrosidad.setVisibility(View.INVISIBLE);
        tvPeligrosidad = (TextView) findViewById(R.id.tvPeligrosidad);
        tvPeligrosidad.setVisibility(View.INVISIBLE);

        cbQuebranto = (CheckBox) findViewById(R.id.cbQuebranto);
        etQuebranto = (EditText) findViewById(R.id.etQuebranto);
        etQuebranto.setVisibility(View.INVISIBLE);
        tvQuebranto = (TextView) findViewById(R.id.tvQuebranto);
        tvQuebranto.setVisibility(View.INVISIBLE);

        final Map<CheckBox, EditText> checkBoxEditTextMap = new HashMap<>();
        checkBoxEditTextMap.put(cbAntiguedad, etAntiguedad);
        checkBoxEditTextMap.put(cbConvenio, etConvenio);
        checkBoxEditTextMap.put(cbTransporte, etTransporte);
        checkBoxEditTextMap.put(cbPeligrosidad, etPeligrosidad);
        checkBoxEditTextMap.put(cbQuebranto, etQuebranto);

        final Map<CheckBox, TextView> checkBoxTextViewMap = new HashMap<>();
        checkBoxTextViewMap.put(cbAntiguedad,tvAntiguedad);
        checkBoxTextViewMap.put(cbConvenio, tvConvenio);
        checkBoxTextViewMap.put(cbTransporte, tvTransporte);
        checkBoxTextViewMap.put(cbPeligrosidad, tvPeligrosidad);
        checkBoxTextViewMap.put(cbQuebranto, tvQuebranto);

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
        cbPeligrosidad.setOnClickListener(cbListener);
        cbQuebranto.setOnClickListener(cbListener);




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