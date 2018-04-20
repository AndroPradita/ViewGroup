package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class merkurius extends AppCompatActivity {

    Button BtnNext, BtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merkurius);

        //casting
        BtnNext = (Button) findViewById(R.id.BtnNextMerkurius);
        BtnBack = (Button) findViewById(R.id.BtnBackMerkurius);

        //Function

        BtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent venus = new Intent(merkurius.this, venus.class);
                startActivity(venus);
            }
        });

        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent venus = new Intent(merkurius.this, MainActivity.class);
                startActivity(venus);
            }
        });
    }
}
