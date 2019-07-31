package com.example.cx62.rpk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class Absen extends AppCompatActivity {

    Button Buttone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absen);

        Buttone = (Button) findViewById(R.id.submithistory);
        Buttone.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent i = new Intent(Absen.this, History.class);
                                           startActivity(i);
                                       }
                                   }

        );
    }
}
