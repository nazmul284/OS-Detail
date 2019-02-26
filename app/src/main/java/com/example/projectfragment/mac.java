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
public class mac extends Fragment {


    public mac() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mac, container, false);
        TextView _mac=(TextView)view.findViewById(R.id.mac_);
        _mac.setText("macOS is a series of graphical operating systems developed and marketed by Apple Inc. since 2001.\n" +
                "It is the primary operating system for Apple's Mac family of computers. Within the market of desktop,\n" +
                "laptop and home computers, and by web usage, it is the second most widely used desktop OS, after Microsoft Windows.\n" +
                " \n" +
                " \n" +
                "Developer: Apple Inc.\n" +
                "\n" +
                "Latest release: 10.14.3 (18D109) (February 7, 2019)\n" +
                "\n" +
                "Latest preview: 10.14.4 beta 2 (18E184e) (February 4, 2019)\n" +
                "\n" +
                "Initial release date: March 24, 2001\n" +
                "\n" +
                "Written in: C++, Objective-C, Swift");
        // Inflate the layout for this fragment
        return view;
    }

}
