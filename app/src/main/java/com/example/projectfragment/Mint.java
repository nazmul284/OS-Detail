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
public class Mint extends Fragment {


    public Mint() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mint, container, false);
        TextView _mint=(TextView)view.findViewById(R.id.mint_);
        _mint.setText("Linux Mint is a community-driven Linux distribution based on Debian and Ubuntu that strives to be a \"modern,\n" +
                "elegant and comfortable operating system which is both powerful and easy to use.\"\n" +
                "\n" +
                "\n" +
                "Package manager: dpkg\n" +
                "\n" +
                "Developer: Clément Lefèbvre, Jamie Boo Birse, Kendall Weaver, and community\n" +
                "\n" +
                "Initial release date: August 27, 2006\n" +
                "\n" +
                "License: Mainly GPL and other free software licenses, minor additions of proprietary software\n" +
                "\n" +
                "Latest release: Linux Mint 19.1 \"Tessa\" / 19 December 2018\n" +
                "\n" +
                "Default user interface: GNOME\n\n");
        // Inflate the layout for this fragment
        return view;
    }

}
