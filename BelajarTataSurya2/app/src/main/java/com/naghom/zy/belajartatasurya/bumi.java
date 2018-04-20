package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bumi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bumi);
//casting
        Button Btnnext = (Button)findViewById(R.id.BtnNextBumi);
        Button Btnback = (Button)findViewById(R.id.BtnBackBumi);


        //function
        Btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bumi = new Intent(bumi.this, mars.class);
                startActivity(bumi);
            }
        });

        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent venus = new Intent(bumi.this, venus.class);
                startActivity(venus);
            }
        });
    }
}