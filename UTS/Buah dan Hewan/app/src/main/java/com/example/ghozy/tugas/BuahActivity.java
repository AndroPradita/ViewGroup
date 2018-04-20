package com.example.ghozy.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BuahActivity extends AppCompatActivity {


    @BindView(R.id.btn_buah_alpukat)
    Button btn_buah_alpukat;

    // TODO Ini adalah Butter Knife untuk tombol Home
    @OnClick(R.id.btn_buah_alpukat)
    void alpukat() {
        Intent intentAlpukat = new Intent(BuahActivity.this, BuahAlpukat.class);
        startActivity(intentAlpukat);
    }

    // TODO Ini adalah Butter Knife untuk tombol Home
    @OnClick(R.id.btn_buah_apel)
    void apel() {
        Intent intentApel = new Intent(BuahActivity.this, BuahApel.class);
        startActivity(intentApel);
    }

    // TODO Ini adalah Butter Knife untuk tombol Home
    @OnClick(R.id.btn_buah_durian)
    void durian() {
        Intent intentDurian = new Intent(BuahActivity.this, BuahDurian.class);
        startActivity(intentDurian);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);
        ButterKnife.bind(this);
    }
}
