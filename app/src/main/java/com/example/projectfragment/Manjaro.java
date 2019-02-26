package com.example.projectfragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Manjaro extends Fragment {


    public Manjaro() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_manjaro, container, false);
        TextView _manjaro=(TextView)view.findViewById(R.id.manjaro_);
        _manjaro.setText("Manjaro Linux, or simply Manjaro, is an open-source operating system for computers.\n" +
                "It is a distribution of Linux based on the Arch Linux distribution.\n" +
                "\n" +
                "\n" +
                "Initial release date: July 10, 2011\n" +
                "\n" +
                "Latest release: 18.0.2 Codename \"Illyria\" / 31 December 2018\n" +
                "\n" +
                "Latest preview: 18.0.1-rc2\n" +
                "\n" +
                "Working state: Current (Bleeding edge, rolling release)\n" +
                "\n" +
                "OS family: Unix-like\n" +
                "\n" +
                "Default user interfaces: Xfce, KDE Plasma 5, GNOME\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
