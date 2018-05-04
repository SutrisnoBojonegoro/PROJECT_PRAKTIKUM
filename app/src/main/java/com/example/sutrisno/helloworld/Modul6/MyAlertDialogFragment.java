package com.example.sutrisno.helloworld.Modul6;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.sutrisno.helloworld.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyAlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        return new AlertDialog.Builder(getActivity()).setIcon(android.R.drawable.stat_notify_error).
                // positif button
                setTitle("Alert dialog fragment example").setMessage("This is a message").
                setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getActivity(),"Pressed OK", Toast.LENGTH_SHORT).show();
                    }

                }).
                // negative button
                setNegativeButton("Cencel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(),"Cancel" , Toast.LENGTH_SHORT).show();
                    }
                }).create();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_modul6_myalertdialog, container, false);
    }

    public void show(FragmentManager manager, String fragment_edit_name) {

    }

    public interface UserNameListener {

    }
}