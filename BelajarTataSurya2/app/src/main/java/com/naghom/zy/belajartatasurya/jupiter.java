package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jupiter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jupiter);
        //casting
        Button Btnnext = (Button)findViewById(R.id.BtnNextJupiter);
        Button Btnback = (Button)findViewById(R.id.BtnBackJupiter);


        //function
        Btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bumi = new Intent(jupiter.this, saturnus.class);
                startActivity(bumi);
            }
        });

        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bumi = new Intent(jupiter.this, mars.class);
                startActivity(bumi);
            }
        });
    }
}
