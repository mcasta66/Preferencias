package com.example.cfgs.preferencias;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv =(TextView)findViewById(R.id.tv1);
        lanzarPreferencias(null);
    }

    public void mostrarPreferencias(View view){
        SharedPreferences pref =
                PreferenceManager.getDefaultSharedPreferences(this);
        String s = "opcion1: "+ pref.getBoolean("opcion1",true)
                +", opcion2: " + pref.getString("opcion2","?") + ", opcion3: "+ pref.getString("opcion3","?");

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
        tv.setText(s);
    }

    public void lanzarPreferencias(View view){
        Intent i = new Intent(this, PreferenciasActivity.class);
        startActivity(i);
    }

}
