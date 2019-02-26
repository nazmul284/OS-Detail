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
public class Debian extends Fragment {


    public Debian() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_debian, container, false);
        TextView _debian=(TextView)view.findViewById(R.id.debian_);

        _debian.setText("Debian is a Unix-like operating system consisting entirely of free software.\n" +
                "Ian Murdock started the Debian Project on August 16, 1993. \n" +
                "ebian 0.01 was released on September 15, 1993, and the first stable version, 1.1, was released on June 17, 1996.\n" +
                "\n" +
                "\n" +
                "Package manager: APT (front-end), dpkg\n" +
                "\n" +
                "Initial release: September 1993;\n" +
                "\n" +
                "License: DFSG-compatible licenses\n" +
                "\n" +
                "Developer: The Debian Project\n" +
                "\n" +
                "Userland: GNU\n" +
                "\n" +
                "OS family: Linux");
        // Inflate the layout for this fragment
        return view;
    }

}
