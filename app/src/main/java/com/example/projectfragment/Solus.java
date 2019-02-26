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
public class Solus extends Fragment {


    public Solus() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_solus, container, false);
        TextView _solus=(TextView)view.findViewById(R.id.solus_);
        _solus.setText("Solus is an independent desktop operating system based on the Linux kernel.\n" +
                "It is offered as a curated rolling release model under the slogan \"Install Today. Updates Forever\".\n" +
                "\n" +
                "\n" +
                "Package manager: eopkg\n" +
                "\n" +
                "Initial release date: December 27, 2015\n" +
                "\n" +
                "Latest release: 3.9999 (Solus 3 ISO Refresh) / 20 September 2018\n" +
                "\n" +
                "OS family: Unix-like\n" +
                "\n" +
                "Source model: Open source\n" +
                "\n" +
                "Default user interfaces: Budgie, GNOME, MATE\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
