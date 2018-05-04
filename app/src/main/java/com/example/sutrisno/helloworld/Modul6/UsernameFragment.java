package com.example.sutrisno.helloworld.Modul6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sutrisno.helloworld.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UsernameFragment extends Fragment {


    public UsernameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_modul6_username, container, false);
    }

}
