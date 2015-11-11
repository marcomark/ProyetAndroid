package com.example.admin.ine1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.LENGTH_SHORT;

public class Fragment1 extends Fragment {
    private Button boton;
    private ListView lvf1;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // return inflater.inflate(R.layout.fragment_fragment1, container, false);
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        lvf1=(ListView)view.findViewById(R.id.listViewfragmento1);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            list.add("cololeccion de items" + i);

        }


        ArrayAdapter adp = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, list);
        lvf1.setAdapter(adp);




        /*boton = (Button)view.findViewById(R.id.buttonfra1);

        boton.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){
                boton.setText("hola");
                Toast.makeText(getActivity(),"boton",LENGTH_SHORT).show();

            }

        });*/

        return view;


    }


}
