package com.naghom.zy.belajartatasurya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class quiz_3 extends AppCompatActivity {

    EditText jawab;
    Button lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_3);

        //casting

        jawab = (EditText) findViewById(R.id.answer);
        lanjut = (Button) findViewById(R.id.next3);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (jawab.getText().toString().equals("merkurius")) {
                    Intent jawaban = new Intent(quiz_3.this, quiz_4.class);
                    startActivity(jawaban);
                    Toast.makeText(getApplicationContext(), "Jawaban Kamu Benar! soal selanjutnya...", Toast.LENGTH_SHORT).show();
                } else if (jawab.getText().toString().equals("Merkurius")) {
                    Intent jawaban = new Intent(quiz_3.this, quiz_4.class);
                    startActivity(jawaban);
                    Toast.makeText(getApplicationContext(), "Jawaban Kamu Benar! soal selanjutnya...", Toast.LENGTH_SHORT).show();
                } else if (jawab.getText().toString().equals("MERKURIUS")) {
                    Intent jawaban = new Intent(quiz_3.this, quiz_4.class);
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
        Toast.makeText(quiz_3.this, "Tidak Bisa Kembali !", Toast.LENGTH_LONG).show();
    }
}