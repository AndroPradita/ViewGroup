package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class uranus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uranus);
        //casting
        Button Btnnext = (Button)findViewById(R.id.BtnNextUranus);
        Button Btnback = (Button)findViewById(R.id.BtnBackUranus);


        //function
        Btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent neptunus = new Intent(uranus.this, neptunus.class);
                startActivity(neptunus);
            }
        });

        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent saturnus = new Intent(uranus.this, saturnus.class);
                startActivity(saturnus);
            }
        });
    }
}
