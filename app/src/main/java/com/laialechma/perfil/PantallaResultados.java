package com.laialechma.perfil;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PantallaResultados extends AppCompatActivity {

    //ArrayList<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_resultados);
        agregarbotones();
    }
        /*
        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto("Ana Maria", "anamaria@gmail.com", "77799945"));
        ArrayList<String> nombresContacto = new ArrayList<>();
        for (Contacto contacto : contactos){
            nombresContacto.add(contactos.getname()
        }

        ListView lstContactos = (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contactos));


       Bundle parametros = getIntent().getExtras();
        String pname = parametros.getString(getResources().getString(R.string.pname));
        String ptelefono = parametros.getString(getResources().getString(R.string.ptelefono));
        String pmail = parametros.getString(getResources().getString(R.string.pmail));
        String pdescripcion = parametros.getString(getResources().getString(R.string.pdescripcion));

        TextInputEditText txtname = (TextInputEditText) findViewById(R.id.txtname);
        TextInputEditText txttelephone = (TextInputEditText) findViewById(R.id.txttelephone);
        TextInputEditText txtmail = (TextInputEditText) findViewById(R.id.txtmail);
        TextInputEditText txtdescripcion = (TextInputEditText) findViewById(R.id.txtdescripcion);

        txtname.setText(pname);
        txttelephone.setText(ptelefono);
        txtmail.setText(pmail);
        txtdescripcion.setText(pdescripcion);

    */


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(PantallaResultados.this, MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }

    public void agregarbotones(){
        Button botonModificar = (Button) findViewById(R.id.botonModificar);
        botonModificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, getResources().getString(R.string.click_boton_modificar), Snackbar.LENGTH_SHORT).show();

            }
        });

        botonModificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PantallaResultados.this,MainActivity.class);
                //intent.putExtra(getResources().getString(R.string.pname), contacto.get(position).getName);
                startActivity(intent);
                finish();
            }
        });
    }
    }

