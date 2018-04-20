package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class quiz_1 extends AppCompatActivity {

    EditText jawab;
    Button lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_1);
        //casting

        jawab = (EditText) findViewById(R.id.answer);
        lanjut = (Button) findViewById(R.id.next3);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jawab.getText().toString().equals("uranus")) {
                    Intent jawaban = new Intent(quiz_1.this, quiz_2.class);
                    startActivity(jawaban);
                    Toast.makeText(getApplicationContext(), "Jawaban Kamu Benar! soal selanjutnya...", Toast.LENGTH_SHORT).show();
                } else if (jawab.getText().toString().equals("Uranus")) {
                    Intent jawaban = new Intent(quiz_1.this, quiz_2.class);
                    startActivity(jawaban);
                    Toast.makeText(getApplicationContext(), "Jawaban Kamu Benar! soal selanjutnya...", Toast.LENGTH_SHORT).show();
                } else if (jawab.getText().toString().equals("URANUS")) {
                    Intent jawaban = new Intent(quiz_1.this, quiz_2.class);
                    startActivity(jawaban);
                    Toast.makeText(getApplicationContext(), "Jawaban Kamu Benar! soal selanjutnya...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Jawaban Salah! Coba lagi...", Toast.LENGTH_SHORT).show();
                }
                ;


            }
        });

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(quiz_1.this, "Tidak Bisa Kembali !", Toast.LENGTH_LONG).show();
    }
}