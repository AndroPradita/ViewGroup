package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class quiz_2 extends AppCompatActivity {
    RadioButton rb_bumi, rb_saturnus, rb_jupiter, rb_uranus;
    Button btn_next1;

    int nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_2);
        //casting
        rb_bumi = (RadioButton) findViewById(R.id.bumi);
        rb_saturnus = (RadioButton) findViewById(R.id.saturnus);
        rb_jupiter = (RadioButton) findViewById(R.id.jupiter);
        rb_uranus = (RadioButton) findViewById(R.id.uranus);
        btn_next1 = (Button) findViewById(R.id.selanjutnya);


// kalo ga di klik rb_saturnus maka akan muncul jawaban salah //
        btn_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rb_saturnus.isChecked()) {
                    Intent jawaban = new Intent(quiz_2.this, quiz_3.class);
                    startActivity(jawaban);
                    Toast.makeText(getApplicationContext(), "Jawaban Kamu Benar! soal selanjutnya...", Toast.LENGTH_SHORT).show();
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
        Toast.makeText(quiz_2.this, "Tidak Bisa Kembali !", Toast.LENGTH_LONG).show();
    }
}