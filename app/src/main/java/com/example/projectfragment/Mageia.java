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
public class Mageia extends Fragment {


    public Mageia() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mageia, container, false);
        TextView _mageia=(TextView)view.findViewById(R.id.mageia_);
        _mageia.setText("Mageia is a Linux-based operating system, distributed as free and open source software.\n" +
                "It is forked from the Mandriva Linux distribution. The Greek term mageía means enchantment, fascination, glamour, wizardry.\n" +
                "The first release of the software distribution, Mageia 1, took place in June 2011.\n" +
                "\n" +
                "\n" +
                "Latest release: 6.1 / October 5, 2018\n" +
                "\n" +
                "Initial release date: 2011\n" +
                "\n" +
                "OS family: Unix-like\n" +
                "\n" +
                "Update method: Timelessly released\n" +
                "\n" +
                "License: Free software licenses; (mainly GPL) and other licenses\n" +
                "\n" +
                "Default user interfaces: KDE Plasma 4, GNOME Shell, Xfce\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
