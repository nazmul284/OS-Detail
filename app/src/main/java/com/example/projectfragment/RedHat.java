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
public class RedHat extends Fragment {


    public RedHat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_red_hat, container, false);

        TextView _red=(TextView)view.findViewById(R.id.red_);

        _red.setText("Red Hat Linux, created by the company Red Hat, was a widely used Linux distribution until its discontinuation in 2004.\n" +
                "Early releases of Red Hat Linux were called Red Hat Commercial Linux. Red Hat published the first non-beta release in May 1995.\n" +
                "\n" +
                "\n" +
                "Package manager: RPM Package Manager\n" +
                "\n" +
                "Initial release date: May 13, 1995\n" +
                "\n" +
                "Final release: 9 alias Shrike / March 31, 2003\n" +
                "\n" +
                "Working state: Discontinued\n" +
                "\n" +
                "OS family: Unix-like\n" +
                "\n" +
                "Source model: Open source\n\n");

        // Inflate the layout for this fragment
        return view;
    }

}
