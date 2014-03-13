package com.example.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);


//        Button b = (Button) findViewById(R.id.button5);
//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                startActivity(new Intent(MainActivity.this, about.class));
//            }
//        });

        Button btnAuthLeading = (Button) findViewById(R.id.btnAutheLeading);
        btnAuthLeading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Moduls.class));
            }


        });


        Button btnLiveActives = (Button) findViewById(R.id.btnLiveActive);
        btnLiveActives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Moduls.class));
            }


        });
        Button btnFamilyBuis = (Button) findViewById(R.id.familyBusi);
        btnFamilyBuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Moduls.class));
            }


        });

        Button btnStrtPlus = (Button) findViewById(R.id.btnStartPlus);
        btnStrtPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Moduls.class));
            }


        });

    }
}
