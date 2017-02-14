package com.uabc.lsc.a01128562.clase03;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    private Intent intent2;
    private Button boton;
    private Button boton2;
    private EditText nombre;
    private EditText direccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=(Button)findViewById(R.id.button);
        boton2=(Button)findViewById(R.id.button2);
        nombre=(EditText)findViewById(R.id.editText);
        direccion=(EditText)findViewById(R.id.editText2);
        intent=new Intent(this,actividadDos.class);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String miNomb=nombre.getText().toString();
                intent.putExtra("nombre",miNomb);
                startActivity(intent);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=direccion.getText().toString();
                if(url.contains("https://") || url.contains("http://")){
                    intent2= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                }else
                    intent2= new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+url));

                startActivity(intent2);
            }
        });
    }


}
