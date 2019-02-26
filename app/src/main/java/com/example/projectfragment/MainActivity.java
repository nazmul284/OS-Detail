package com.example.projectfragment;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView _osList;
    String[] osList = {"Android","Ubuntu","Windows 10", "Windows 8","Windows 7","XP","Windows Vista",
    "Mac OS","Debian", "IOS","Kali Linux","Red Hat", "Elemetary","Solus","Mint","Mageia","Kubuntu","Manjaro"};
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _osList = (ListView) findViewById(R.id.list);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, osList);
        _osList.setAdapter(adapter);

        _osList.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        try {
            Fragment fragment;

            if(position==0){

                fragment = new Android();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==1){
                fragment = new Ubuntu();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==2){
                fragment = new Windows10();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==3){
                fragment = new Windows8();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==4){
                fragment = new Windows7();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==5){
                fragment = new Xp();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==6){
                fragment = new WindowsVista();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==7){
                fragment = new mac();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==8){
                fragment = new Debian();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==9){
                fragment = new IOS();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==10){
                fragment = new Kali();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==11){
                fragment = new RedHat();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==12){
                fragment = new Elementary();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==13){
                fragment = new Solus();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==14){
                fragment = new Mint();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==15){
                fragment = new Mageia();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==16){
                fragment = new Kubuntu();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }else if(position==17){
                fragment = new Manjaro();
                getFragmentManager().beginTransaction().replace(R.id.fragment,fragment).commit();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.about){
            Intent aboutIntent=new Intent(getApplicationContext(), About.class);
            startActivity(aboutIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
