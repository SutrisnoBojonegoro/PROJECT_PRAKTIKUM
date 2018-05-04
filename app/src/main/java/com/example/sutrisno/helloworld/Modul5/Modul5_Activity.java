package com.example.sutrisno.helloworld.Modul5;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sutrisno.helloworld.R;


public class Modul5_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul5_);
    }


    public void onButtonClick(View v) {
        Modul5_Fragment_02 fragmentTwo =(Modul5_Fragment_02)
                getSupportFragmentManager().findFragmentById(R.id.fragment_two);


        switch (v.getId()){

            case R.id.btn_one_create_new :
                if(fragmentTwo == null) {
                    //PHONE !  // Need to launch another activity
                    Intent intent = new Intent(Modul5_Activity.this ,
                            Modul5_Activity_drawing.class);
                    startActivity(intent);

                }else{
                    // TABLET! // Do nothing right now, and just show up a toast.
                    Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_one_open_existing :
                Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT ).show();
                break;
            default:
        }
    }
}
