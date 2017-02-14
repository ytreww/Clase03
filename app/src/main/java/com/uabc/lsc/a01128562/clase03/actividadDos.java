package com.uabc.lsc.a01128562.clase03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class actividadDos extends AppCompatActivity {

    private Intent intent;
    private TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);
        texto=(TextView)findViewById(R.id.textView);
        intent=getIntent();
        String elNombre=intent.getStringExtra("nombre");
        texto.setText(elNombre);

    }
}
