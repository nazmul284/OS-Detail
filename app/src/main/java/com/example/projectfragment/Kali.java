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
public class Kali extends Fragment {


    public Kali() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kali, container, false);

        TextView _kali = (TextView) view.findViewById(R.id.kali_);

        _kali.setText("Kali Linux is a Debian-based Linux distribution aimed at advanced Penetration Testing and Security Auditing. " +
                "Kali contains several hundred tools which are geared towards various information security tasks, such as Penetration " +
                "Testing, Security research, Computer Forensics and Reverse Engineering. Kali Linux is developed, funded and maintained by" +
                " Offensive Security, a leading information security training company.\n" +
                "\n" +
                "Kali Linux was released on the 13th March, 2013 as a complete, top-to-bottom rebuild of BackTrack Linux, adhering completely" +
                " to Debian development standards.\n" +
                "\n" +
                "More than 600 penetration testing tools included: After reviewing every tool that was included in BackTrack, we eliminated a great " +
                "number of tools that either simply did not work or which duplicated other tools that provided the same or similar functionality. " +
                "Details on what\u0092s included are on the Kali Tools site.\n\n" +
                "Free (as in beer) and always will be: Kali Linux, like BackTrack, is completely free of charge and always will be. " +
                "You will never, ever have to pay for Kali Linux.\n\n" +
                "Open source Git tree: We are committed to the open source development model and our development tree is available for all to see." +
                " All of the source code which goes into Kali Linux is available for anyone who wants to tweak or rebuild packages to suit their " +
                "specific needs.\n\n" +
                "FHS compliant: Kali adheres to the Filesystem Hierarchy Standard, allowing Linux users to easily locate binaries, support files, " +
                "libraries, etc.\n\n" +
                "Wide-ranging wireless device support: A regular sticking point with Linux distributions has been supported for wireless interfaces." +
                " We have built Kali Linux to support as many wireless devices as we possibly can, allowing it to run properly on a wide variety of" +
                " hardware and making it compatible with numerous USB and other wireless devices.\n\n" +
                "Custom kernel, patched for injection: As penetration testers, the development team often needs to do wireless assessments," +
                " so our kernel has the latest injection patches included.\n\n" +
                "Developed in a secure environment: The Kali Linux team is made up of a small group of individuals who are the only ones" +
                " trusted to commit packages and interact with the repositories, all of which is done using multiple secure protocols.\n\n" +
                "GPG signed packages and repositories: Every package in Kali Linux is signed by each individual developer who built and committed it," +
                " and the repositories subsequently sign the packages as well.\n\n" +
                "Multi-language support: Although penetration tools tend to be written in English, we have ensured that Kali includes true multilingual" +
                " support, allowing more users to operate in their native language and locate the tools they need for the job.\n\n" +
                "Completely customizable: We thoroughly understand that not everyone will agree with our design decisions, so we have made it as " +
                "easy as possible for our more adventurous users to customize Kali Linux to their liking, all the way down to the kernel.\n\n" +
                "ARMEL and ARMHF support: Since ARM-based single-board systems like the Raspberry Pi and BeagleBone Black, among others, are " +
                "becoming more and more prevalent and inexpensive, we knew that Kali\u0092s ARM support would need to be as robust as we could manage," +
                " with fully working installations for both ARMEL and ARMHF systems. Kali Linux is available on a wide range of ARM devices and has ARM " +
                "repositories integrated with the mainline distribution so tools for ARM are updated in conjunction with the rest of the distribution.\n");


        // Inflate the layout for this fragment
        return view;

    }



}
