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
public class Windows7 extends Fragment {


    public Windows7() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_windows7, container, false);
        TextView _windows7=(TextView)view.findViewById(R.id.windows7_);
        _windows7.setText("Windows 7 is a personal computer operating system that was produced by Microsoft as part of the Windows NT family of operating systems.\n" +
                "It was released to manufacturing on July 22, 2009 and became generally available on October 22, 2009, less than three years after the release of its predecessor, \n" +
                "Windows Vista.\n" +
                "\n" +
                "\n" +
                "Initial release date: July 22, 2009\n" +
                "\n" +
                "Developer: Microsoft\n" +
                "\n" +
                "Platforms: IA-32 and x86-64\n" +
                "\n" +
                "Latest release: Service Pack 1 (6.1.7601) / February 22, 2011\n" +
                "\n" +
                "Released to manufacturing: July 22, 2009\n" +
                "\n" +
                "OS family: Windows NT\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
