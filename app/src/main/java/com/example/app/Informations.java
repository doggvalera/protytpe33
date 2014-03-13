package com.example.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by valerijszemlanikins on 13.03.14.
 */
public class Informations extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infopage);


        Button btnMoreInf = (Button) findViewById(R.id.btnMoreInformation);
        Log.v("MyApp", "SetListener");


        btnMoreInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("MyApp", "OnClick");
                startActivity(new Intent(Informations.this, MainActivity.class));

//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
//                startActivity(browserIntent);

                // startActivity(new Intent(Informations.this, Moduls.class));
//                Intent viewIntent = new Intent("Intent.action.VIEW", Uri.parse("http://www.google.com"));
//                startActivity(viewIntent);
                //final Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.google.com"));
                //activity.startActivity(intent);
            }


        });

    }

}
