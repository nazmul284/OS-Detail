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
public class Kubuntu extends Fragment {


    public Kubuntu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_kubuntu, container, false);
        TextView _kubuntu=(TextView)view.findViewById(R.id.kubuntu_);
        _kubuntu.setText("Kubuntu is an official flavour of the Ubuntu operating system which uses the KDE Plasma Desktop instead of the GNOME desktop environment.\n" +
                "As part of the Ubuntu project, Kubuntu uses the same underlying systems.\n" +
                "\n" +
                "\n" +
                "Package manager: dpkg\n" +
                "\n" +
                "Initial release date: April 8, 2005\n" +
                "\n" +
                "Default user interface: KDE Plasma 4\n" +
                "\n" +
                "OS family: Linux\n" +
                "\n" +
                "Latest release: 18.10 (Cosmic Cuttlefish) / 18 October 2018\n" +
                "\n" +
                "Update methods: PackageKit, APT\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
