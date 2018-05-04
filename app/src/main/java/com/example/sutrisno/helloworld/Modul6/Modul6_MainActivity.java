package com.example.sutrisno.helloworld.Modul6;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sutrisno.helloworld.R;

public class Modul6_MainActivity extends Activity implements MyAlertDialogFragment.UserNameListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul6_main);
    }

    public void onButtonClick(View view) {
// close existing dialog fragments
        FragmentManager manager = getFragmentManager();
        Fragment frag = manager.findFragmentById(Integer.parseInt("fragment_edit_name"));

        if (frag != null) {
            manager.beginTransaction().remove(frag).commit();
        }
        switch (view.getId()) {
            case R.id.showCustomFragment:
                MyDialogFragment editNameDialog = new MyDialogFragment();
                //editNameDialog.show(manager, "fragment_edit_name"​);
                editNameDialog.show(manager, "fragment_edit_name");
                break;
            case R.id.showAlertDialogFragment:
                MyAlertDialogFragment alertDialogFragment = new
                        MyAlertDialogFragment();
                alertDialogFragment.show(manager, "fragment_edit_name");
                //alertDialogFragment.show(manager, "fragment_edit_name"​);
                break;
        }
    }
}
