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
public class Windows10 extends Fragment {


    public Windows10() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_windows10, container, false);

        TextView _windows10=(TextView)view.findViewById(R.id.windows10_);
        _windows10.setText("Windows 10 is a series of personal computer operating systems produced by Microsoft as part " +
                "of its Windows NT family of operating systems.\n" +
                "It is the successor to Windows 8.1, and was released to manufacturing on July 15, 2015, and broadly " +
                "released for retail sale on July 29, 2015.\n" +
                "\n" +
                "License: Trialware, Microsoft Software Assurance, MSDN subscription, Microsoft Imagine\n" +
                "\n" +
                "Initial release date: July 29, 2015\n" +
                "\n" +
                "Developer: Microsoft\n" +
                "\n" +
                "Platforms: IA-32, x86-64 and, as of version 1709, ARM64\n" +
                "\n" +
                "Released to manufacturing: July 15, 2015\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
