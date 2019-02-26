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
public class IOS extends Fragment {


    public IOS() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_io, container, false);
        TextView _ios=(TextView)view.findViewById(R.id.ios_);
        _ios.setText("IOS is a mobile operating system created and developed by Apple Inc. " +
                "exclusively for its hardware.\n" +
                "It is the operating system that presently powers many of the company's mobile devices," +
                " including the iPhone, iPad, and iPod Touch.\n" +
                "It is the second most popular mobile operating system globally after Android.\n" +
                "\n" +
                "\n" +
                "Developer: Apple Inc.\n" +
                "\n" +
                "Platforms: ARMv8-A (iOS 7 and later); ARMv7-A (iPhone OS 3–iOS 10); ARMv6 (iPhone OS 1–iOS 4.2.1)\n" +
                "\n" +
                "Initial release date: June 29, 2007\n" +
                "\n" +
                "Default user interface: Cocoa Touch\n" +
                "\n" +
                "Latest preview: 12.2 Beta 2 (16E5191d) (February 4, 2019)\n" +
                "\n" +
                "Written in: C++, Objective-C, Swift\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
