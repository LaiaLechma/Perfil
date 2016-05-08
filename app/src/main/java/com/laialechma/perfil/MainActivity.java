package com.laialechma.perfil;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,getResources().getString(R.string.oncreate), Toast.LENGTH_LONG).show();
        agregarbotones();
        agregartelefono();
        agregarmail();
        agregartext();
        agregardescripcion();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,getResources().getString(R.string.onstart), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,getResources().getString(R.string.onrestart), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,getResources().getString(R.string.onresume), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,getResources().getString(R.string.onpause), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,getResources().getString(R.string.onstop), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,getResources().getString(R.string.ondestroy), Toast.LENGTH_LONG).show();
    }



    public void agregartext(){
        TextInputEditText txtname = (TextInputEditText) findViewById(R.id.txtname);
        txtname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.escribaNombre), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    public void agregartelefono(){
        TextInputEditText txttelephone = (TextInputEditText) findViewById(R.id.txttelephone);
        txttelephone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.escribaTelefono), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    public void agregarmail(){
        TextInputEditText txtmail = (TextInputEditText) findViewById(R.id.txtmail);
        txtmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.escribaMail), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    public void agregardescripcion(){
        TextInputEditText txtdescripcion = (TextInputEditText) findViewById(R.id.txtdescripcion);
        txtdescripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.escribaDescripcion), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    public void agregarbotones(){
        Button botonGuardar = (Button) findViewById(R.id.botonGuardar);
        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.click_boton_guardar), Snackbar.LENGTH_SHORT).show();

            }
        });

        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PantallaResultados.class);
                //intent.putExtra(getResources().getString(R.string.pname),contacto.get(position).getName);
                //intent.putExtra()

                startActivity(intent);
                finish();
            }
        });
    }


}
