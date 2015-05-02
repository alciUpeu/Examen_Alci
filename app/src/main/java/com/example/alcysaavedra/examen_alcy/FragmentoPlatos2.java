package com.example.alcysaavedra.examen_alcy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by Alcy Saavedra on 01/05/2015.
 */
public class FragmentoPlatos2 extends Fragment {

    View rootView;
    Button btn01;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fm_platos2, container, false);

        btn01=(Button) rootView.findViewById(R.id.btn01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Plato 1", Toast.LENGTH_LONG).show();
            }
        });
        return rootView;
    }

}
