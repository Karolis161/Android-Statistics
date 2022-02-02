package com.example.a5laboratorinisandroid;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_2, container, false);
        textView = v.findViewById(R.id.textView3);

        int symbols = 0;
        String symbolsSum;
        char lowerA = 'a';
        char upperA = 'A';

        Bundle bundle = this.getArguments();
        String data = bundle.getString("key");

        for (int j = 0; j < data.length(); j++) {
            if (data.charAt(j) == lowerA || data.charAt(j) == upperA) {
                symbols++;
                symbolsSum = String.valueOf(symbols);
                textView.setText("Šiame tekste yra " + symbolsSum + " simboliai A(a)");
            }
        }
        return v;
    }
}