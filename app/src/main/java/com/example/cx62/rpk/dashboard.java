package com.example.cx62.rpk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class dashboard extends AppCompatActivity {

    Button Buttonc,Buttond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Buttonc = (Button) findViewById(R.id.submitcuti);
        Buttonc.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent i = new Intent(dashboard.this, Cuti.class);
                                           startActivity(i);
                                       }
                                   }

        );
        Buttond = (Button) findViewById(R.id.submitabsen);
        Buttond.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(dashboard.this, Absen.class);
                        startActivity(i);
                    }
                }
        );

    }

}
