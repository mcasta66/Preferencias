package com.example.cfgs.preferencias;

/**
 * Created by Marga on 20/03/2018.
 */

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class PreferenciasFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}

