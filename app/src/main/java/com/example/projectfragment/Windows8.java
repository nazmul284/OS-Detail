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
public class Windows8 extends Fragment {


    public Windows8() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_windows8, container, false);
        TextView _windows8=(TextView)view.findViewById(R.id.windows8_);
        _windows8.setText("Windows 8 is a personal computer operating system that was produced by Microsoft as part of the Windows NT family of operating systems. \n" +
                "The operating system was released to manufacturing on August 1, 2012, with general availability on October 26, 2012.\n" +
                "\n" +
                "\n" +
                "License: Trialware, Microsoft Software Assurance, MSDN subscription, DreamSpark\n" +
                "\n" +
                "Developer: Microsoft\n" +
                "\n" +
                "Released to manufacturing: August 1, 2012\n" +
                "\n" +
                "Final release: '6.2.9200' / August 25, 2012\n" +
                "\n" +
                "General availability: October 26, 2012\n\n");

        // Inflate the layout for this fragment
        return view;
    }

}
