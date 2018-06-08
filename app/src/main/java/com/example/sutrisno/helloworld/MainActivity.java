package com.example.sutrisno.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sutrisno.helloworld.Acc.AccKalkulator_Activity;
import com.example.sutrisno.helloworld.Modul1.Modul1_Activity;
import com.example.sutrisno.helloworld.Modul2.Modul2_Activity;
import com.example.sutrisno.helloworld.Modul3.Modul3_Activity;
import com.example.sutrisno.helloworld.Modul4.Modul4_Activity;
import com.example.sutrisno.helloworld.Modul5.Modul5_Activity;
import com.example.sutrisno.helloworld.Modul6.Modul6_MainActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonacc, buttonModul1, buttonModul2, buttonModul3, buttonModul4,
            buttonModul5, buttonModul6, buttonModul7, buttonModul8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonacc = (Button) findViewById(R.id.btnacc);
        buttonModul1 = (Button) findViewById(R.id.btnmodul1);
        buttonModul2 = (Button) findViewById(R.id.btnmodul2);
        buttonModul3 = (Button) findViewById(R.id.btnmodul3);
        buttonModul4 = (Button) findViewById(R.id.btnmodul4);
        buttonModul5 = (Button) findViewById(R.id.btnmodul5);
        buttonModul6 = (Button) findViewById(R.id.btnmodul6);



        //Method utk klik tombol acc
        buttonacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, AccKalkulator_Activity.class);
                startActivity(intent);
            }
        });

        //Method utk klik tombol modul 1
        buttonModul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, Modul1_Activity.class);
                startActivity(intent);
            }
        });

        //Method utk klik tombol modul 2
        buttonModul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, Modul2_Activity.class);
                startActivity(intent);
            }
        });

        //Method utk klik tombol modul 3
        buttonModul3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, Modul3_Activity.class);
                startActivity(intent);
            }
        });

        //Method utk klik tombol modul 4
        buttonModul4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, Modul4_Activity.class);
                startActivity(intent);
            }
        });

        //Method utk klik tombol modul 5
        buttonModul5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, Modul5_Activity.class);
                startActivity(intent);
            }
        });

        //Method utk klik tombol modul 6
        buttonModul6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //perintah setelah kejadian klik
                Intent intent = new Intent(MainActivity.this, Modul6_MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
