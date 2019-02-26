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
public class Ubuntu extends Fragment {


    public Ubuntu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ubuntu, container, false);

        TextView _ubuntu=(TextView)view.findViewById(R.id.ubuntu_);

        _ubuntu.setText("Ubuntu is a free and open-source Linux distribution based on Debian.\n" +
                "Ubuntu is officially released in three editions: Desktop, Server, and Core.\n" +
                "Ubuntu is a popular operating system for cloud computing, with support for OpenStack.\n" +
                "Ubuntu is released every six months, with long-term support releases every two years.\n" +
                "\n" +
                "Package manager: GNOME Software, APT, dpkg, Snappy\n" +
                "\n" +
                "License: Free software\n" +
                "\n" +
                "Developer: Canonical Ltd.\n" +
                "\n" +
                "Initial release date: October 20, 2004\n" +
                "\n" +
                "Platforms: IA-32, AMD64; ARMhf (ARMv7 + VFPv3-D16), ARM64; " +
                "and only for servers: POWER8 (ppc64le), s390x\n" +
                "\n" +
                "Programming languages: Python, Java, C, C++, C#\n\n");

        // Inflate the layout for this fragment
        return view;
    }

}
