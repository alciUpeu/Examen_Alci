package com.example.alcysaavedra.examen_alcy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alcy Saavedra on 01/05/2015.
 */
public class FragmentoInicio extends Fragment {
    View rootView;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fm_inicio, container, false);

        return rootView;
    }
}
