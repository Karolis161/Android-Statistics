package com.example.a5laboratorinisandroid;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ThirdFragment extends Fragment {

    TextView textView1;
    TextView textView2;
    TextView textView3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vv = inflater.inflate(R.layout.fragment_3, container, false);
        textView1 = vv.findViewById(R.id.textView4);
        textView2 = vv.findViewById(R.id.textView5);
        textView3 = vv.findViewById(R.id.textView6);

        int symbols, vowelChar = 0, lowerCase = 0, upperCase = 0;
        String symbolsSum, vowelSum, lowerCaseSum, upperCaseSum;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        Bundle bundle = this.getArguments();
        String data = bundle.getString("comb");

        symbols = data.length();
        symbolsSum = String.valueOf(symbols);

        for (char vowel : vowels)
            for (char letter : data.toLowerCase().toCharArray())
                if (letter == vowel)
                    vowelChar++;
        vowelSum = String.valueOf(vowelChar);

        for (int i = 0; i < data.length(); i++) {
            if (Character.isLowerCase((data.charAt(i))))
                lowerCase++;
            else
                upperCase++;
        }
        lowerCaseSum = String.valueOf(lowerCase);
        upperCaseSum = String.valueOf(upperCase);

        textView1.setText("Teksto ilgis yra " + symbolsSum + " simbolių");
        textView2.setText("Tarp jų yra " + vowelSum + " balsės(-ių)");
        textView3.setText("Tarp jų yra " + lowerCaseSum + " mažosios(-ųjų) ir " + upperCaseSum
                + " didžiosios(-ųjų) raidžių");

        return vv;
    }
}