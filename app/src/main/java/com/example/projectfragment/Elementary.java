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
public class Elementary extends Fragment {


    public Elementary() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_elementary, container, false);
        TextView _elementary=(TextView)view.findViewById(R.id.elementary_);

        _elementary.setText("Elementary OS is a Linux distribution based on Ubuntu.\n" +
                "It is the flagship distribution to showcase the Pantheon desktop environment.\n" +
                "The distribution promotes itself as a “fast, open, and privacy-respecting” replacement to macOS and Windows.\n" +
                "It focuses mainly on non-technical users, and has a pay-what-you-want model.\n" +
                "\n" +
                "\n" +
                "Package manager: dpkg\n" +
                "\n" +
                "Initial release date: March 31, 2011\n" +
                "\n" +
                "Update method: APT\n" +
                "\n" +
                "Latest release: 5.0 \"Juno\" / 16 October 2018\n" +
                "\n" +
                "Latest preview: 5.0 \"Juno\" Beta 2 / 20 September 2018\n" +
                "\n" +
                "Programming language: Vala\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
