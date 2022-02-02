package com.example.a5laboratorinisandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Tekstas su A raidėmis");
        arrayList.add("Be ieškomo simbolio");
        arrayList.add("Čia yra ieškomas simbolis");
        arrayList.add("Nieko nebus");
        arrayList.add("Rasi ko ieškai");
        arrayList.add("Tekstas su A raidėmis");
        arrayList.add("Be ieškomo simbolio");
        arrayList.add("Čia yra ieškomas simbolis");
        arrayList.add("Nieko nebus");
        arrayList.add("Rasi ko ieškai");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = (String) listView.getItemAtPosition(i);

                if (item.contains("A") || item.contains("a")) {
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("key", item);
                    SecondFragment fragment = new SecondFragment();
                    fragment.setArguments(bundle1);
                    getFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();

                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("comb", item);
                    ThirdFragment fragment = new ThirdFragment();
                    fragment.setArguments(bundle2);
                    getFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
                }
            }
        });
    }
}