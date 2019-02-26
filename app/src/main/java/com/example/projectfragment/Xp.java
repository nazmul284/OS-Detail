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
public class Xp extends Fragment {


    public Xp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_xp, container, false);
        TextView _xp=(TextView) view.findViewById(R.id.xp_);
        _xp.setText("Windows XP is a personal computer operating system produced by Microsoft as part of the Windows NT family of operating systems.\n" +
                "It was released to manufacturing on August 24, 2001, and broadly released for retail sale on October 25, 2001.\n" +
                "\n" +
                "\n" +
                "Platforms: IA-32, x86-64 and Itanium\n" +
                "\n" +
                "Initial release date: August 24, 2001\n" +
                "\n" +
                "License: Proprietary commercial software\n" +
                "\n" +
                "Developer: Microsoft\n" +
                "\n" +
                "Released to manufacturing: August 24, 2001\n" +
                "\n" +
                "Final release: Service Pack 3 (5.1.2600) / April 21, 2008\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
