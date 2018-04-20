package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pluto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pluto);

//casting
        Button Btnnext = (Button)findViewById(R.id.BtnHome);
        Button Btnback = (Button)findViewById(R.id.BtnBackPluto);


        //function
        Btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bumi = new Intent(pluto.this, MainActivity.class);
                startActivity(bumi);
            }
        });

        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neptunus = new Intent(pluto.this, neptunus.class);
                startActivity(neptunus);
            }
        });
    }
}

