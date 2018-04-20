package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class saturnus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturnus);
        //casting
        Button Btnnext = (Button)findViewById(R.id.BtnNextSaturnus);
        Button Btnback = (Button)findViewById(R.id.BtnBackSaturnus);


        //function
        Btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent uranus = new Intent(saturnus.this, uranus.class);
                startActivity(uranus);
            }
        });

        Btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jupiter = new Intent(saturnus.this, jupiter.class);
                startActivity(jupiter);
            }
        });
    }
}
