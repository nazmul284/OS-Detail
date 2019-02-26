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
public class WindowsVista extends Fragment {


    public WindowsVista() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_windows_vista, container, false);
        TextView _vista=(TextView)view.findViewById(R.id.vista_);
        _vista.setText("Windows Vista is an operating system that was produced by Microsoft for use on personal computers,\n" +
                "including home and business desktops, laptops, tablet PCs and media center PCs.\n" +
                "\n" +
                "\n" +
                "Initial release date: November 2006\n" +
                "\n" +
                "License: Proprietary commercial software\n" +
                "\n" +
                "Released to manufacturing: November 8, 2006\n" +
                "\n" +
                "Final release: Service Pack 2 (6.0.6002) / May 26, 2009\n" +
                "\n" +
                "General availability: January 30, 2007\n" +
                "\n" +
                "Preceded by: Windows XP (2001)");
        // Inflate the layout for this fragment
        return view;
    }

}
