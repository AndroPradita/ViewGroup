package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mars);
        //casting
        Button Btnnext = (Button)findViewById(R.id.BtnNextMars);
        Button Btnback = (Button)findViewById(R.id.BtnBackMars);


        //function
        Btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jupiter = new Intent(mars.this, jupiter.class);
                startActivity(jupiter);
            }
        });

        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bumi = new Intent(mars.this, bumi.class);
                startActivity(bumi);
            }
        });
    }
}
