package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Moduls extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulepage);

        Button module1 = (Button) findViewById(R.id.btnStartPlus);
        module1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Moduls.this, modul1.class));
            }
        });

        Button module2 = (Button) findViewById(R.id.btnLiveActive);
        module2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Moduls.this, modul1.class));
            }
        });

        Button module3 = (Button) findViewById(R.id.btnAutheLeading);
        module3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Moduls.this, modul1.class));
            }
        });

    }
}
