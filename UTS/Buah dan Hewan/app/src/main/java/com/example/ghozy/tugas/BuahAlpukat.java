package com.example.ghozy.tugas;

import android.media.MediaPlayer;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class BuahAlpukat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah_alpukat);

        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Alpukat");

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, R.color.ijotelor));


//        Button btnPlayAlpukat = (Button) findViewById(R.id.btn_buah_alpukat);
//
//        final MediaPlayer mp = MediaPlayer.create(this, R.raw.alpukat);
//
//        btnPlayAlpukat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mp.start();
//                Toast.makeText(BuahAlpukat.this, "Play",
//                        Toast.LENGTH_LONG).show();
//            }
//        });

    }
}
