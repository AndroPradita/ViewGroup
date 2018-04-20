package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class neptunus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neptunus);
//casting
        Button Btnnext = (Button)findViewById(R.id.BtnNextNeptunus);
        Button Btnback = (Button)findViewById(R.id.BtnBackNeptunus);


        //function
        Btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pluto = new Intent(neptunus.this, pluto.class);
                startActivity(pluto);
            }
        });

        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uranus = new Intent(neptunus.this, uranus.class);
                startActivity(uranus);
            }
        });
    }
}

