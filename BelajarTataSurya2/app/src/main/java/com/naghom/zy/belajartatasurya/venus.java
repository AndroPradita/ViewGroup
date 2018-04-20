package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class venus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus);

        //casting
        Button Btnnext = (Button)findViewById(R.id.BtnNextVenus);
        Button Btnback = (Button)findViewById(R.id.BtnBackVenus);


        //function
        Btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bumi = new Intent(venus.this, bumi.class);
                startActivity(bumi);
            }
        });

        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent merkurius = new Intent(venus.this, merkurius.class);
                startActivity(merkurius);
            }
        });
    }
}
