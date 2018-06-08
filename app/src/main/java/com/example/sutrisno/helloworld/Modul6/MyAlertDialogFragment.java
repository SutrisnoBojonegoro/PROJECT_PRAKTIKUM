package com.example.sutrisno.helloworld.Modul6;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class MyAlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                // set dialog icon
                .setIcon(android.R.drawable.stat_notify_error)
                // set Dialog Title
                .setTitle("CONTOH ALERT DIALOG FRAGMENT")
                // Set Dialog Message
                .setMessage("Ini adalah contoh isi dari pesan atau peringatan yang muncul " +
                        "dari alert dialog pragment ...")

                // positive button
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Anda pilih, OK", Toast.LENGTH_SHORT).show();
                    }
                })
                // negative button
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Anda pilih, Cancel", Toast.LENGTH_SHORT).show();
                    }
                }).create();
    }
}
