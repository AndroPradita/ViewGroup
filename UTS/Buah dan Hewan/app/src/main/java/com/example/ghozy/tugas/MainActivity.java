package com.example.ghozy.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**Created by : Ghozy
using ButterKnife**/

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnBuah)
    Button btnBuah;
    @BindView(R.id.btnHewan)
    Button btnHewan;

    // TODO Ini adalah Butter Knife untuk tombol Home
    @OnClick(R.id.btnBuah)
    void kembali() {
        Intent intentHome = new Intent(MainActivity.this, BuahActivity.class);
        startActivity(intentHome);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
