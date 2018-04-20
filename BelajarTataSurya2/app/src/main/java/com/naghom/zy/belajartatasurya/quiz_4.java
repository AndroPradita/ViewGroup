package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class quiz_4 extends AppCompatActivity {
    RadioButton rb_pluto, rb_neptunus, rb_jupiter, rb_uranus;
    Button btn_next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_4);
        //casting
        rb_pluto = (RadioButton) findViewById(R.id.pluto);
        rb_neptunus = (RadioButton) findViewById(R.id.neptunus);
        rb_jupiter = (RadioButton) findViewById(R.id.jupiter);
        rb_uranus = (RadioButton) findViewById(R.id.uranus);
        btn_next1 = (Button) findViewById(R.id.selanjutnya);


        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb_pluto.isChecked()) {
                    Intent jawaban = new Intent(quiz_4.this, final_quiz.class);
                    startActivity(jawaban);
                    Toast.makeText(getApplicationContext(), "Jawaban Kamu Benar! ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Jawaban Salah! Coba lagi...", Toast.LENGTH_SHORT).show();
                }
                ;

            }
        })
        ;
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(quiz_4.this, "Tidak Bisa Kembali !", Toast.LENGTH_LONG).show();
    }
}