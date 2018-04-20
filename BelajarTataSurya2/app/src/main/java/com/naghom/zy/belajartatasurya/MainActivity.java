package com.naghom.zy.belajartatasurya;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button materi, quiz, about, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting

        materi = (Button) findViewById(R.id.materi);
        quiz = (Button) findViewById(R.id.quiz);
        about = (Button) findViewById(R.id.about);
        exit = (Button) findViewById(R.id.exit);

        materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent materi = new Intent(MainActivity.this, merkurius.class);
                startActivity(materi);
            }
        });

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quiz = new Intent(MainActivity.this, home_quiz.class);
                startActivity(quiz);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent about = new Intent(MainActivity.this, about.class);
                startActivity(about);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                AlertDialog.Builder alertexit = new AlertDialog.Builder(
                        MainActivity.this);

                alertexit
                        .setMessage("Apakah Anda yakin akan keluar dari aplikasi ini?")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Keluar")
                        .setCancelable(false)
                        .setPositiveButton("ya",
                                new AlertDialog.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0,
                                                        int arg1) {
                                        System.exit(0);
                                    }
                                })
                        .setNegativeButton("tidak",
                                new AlertDialog.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog a = alertexit.create();
                a.show();
            }
        });

    }
}
