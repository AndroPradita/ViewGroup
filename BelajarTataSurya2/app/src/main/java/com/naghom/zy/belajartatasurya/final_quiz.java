package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class final_quiz extends AppCompatActivity {


    TextView UserName;
    String str_Username;
    Button lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_quiz);

        str_Username = getIntent().getStringExtra("Username");
        UserName = (TextView) findViewById(R.id.username);
        lanjut = (Button) findViewById(R.id.btnya);


        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanjut = new Intent(final_quiz.this, MainActivity.class);
                startActivity(lanjut);
            }
        });

    }

    @Override
    public void onBackPressed (){
        Toast.makeText(final_quiz.this,"Tidak Bisa Kembali !", Toast.LENGTH_LONG).show();
    }
}

