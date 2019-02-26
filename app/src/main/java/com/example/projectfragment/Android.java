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
public class Android extends Fragment {


    public Android() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_android, container, false);

        TextView _android = view.findViewById(R.id.android_);

        _android.setText("Android is a mobile operating system developed by Google.\n" +
                "It is based on a modified version of the Linux kernel and other open source software, " +
                "and is designed primarily for touchscreen mobile devices such as smartphones and tablets. \n" +
                "In addition, Google has further developed Android TV for televisions, Android Auto for cars, " +
                "and Wear OS for wrist watches, each with a specialized user interface.\n" +
                "Variants of Android are also used on game consoles, digital cameras, PCs and other electronics.\n" +
                " \n" +
                "\n" +
                "Initially developed by Android Inc., which Google bought in 2005, Android was unveiled in 2007,\n" +
                "with the first commercial Android device launched in September 2008. \n" +
                "The operating system has since gone through multiple major releases, with the current version being 9 \"Pie\", " +
                "released in August 2018.\n" +
                "The core Android source code is known as Android Open Source Project (AOSP), and is primarily licensed under the Apache License.\n" +
                " \n" +
                "\n" +
                "Android is also associated with a suite of proprietary software developed by Google, \n" +
                "called Google Mobile Services (GMS) that very frequently comes pre-installed in devices, \n" +
                "which usually includes the Google Chrome web browser and Google Search and always includes core apps for services such as Gmail, \n" +
                "as well as the application store and digital distribution platform Google Play, and associated development platform.\n" +
                "These apps are licensed by manufacturers of Android devices certified under standards imposed by Google,\n" +
                "but AOSP has been used as the basis of competing Android ecosystems, such as Amazon.com's Fire OS," +
                " which use their own equivalents to GMS.\n" +
                "\n" +
                "\n" +
                "Android has been the best-selling OS worldwide on smartphones since 2011 and on tablets since 2013. \n" +
                "As of May 2017, it has over two billion monthly active users, the largest installed base of any operating system,\n" +
                "and as of December 2018, the Google Play store features over 2.6 million apps.\n\n");

        // Inflate the layout for this fragment
        return view;
    }

}
