package com.example.uts_syahrani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

public class KonfirmasiActivity extends AppCompatActivity {

    String namaLengkap, nomorPendaftaran, jalurDaftar;
    TextView Nama_tv, Nomor_tv, Jalur_tv;
    Spinner jalur_pd;

    CheckBox confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);

        Nama_tv = findViewById(R.id.Nama_tv);
        Nomor_tv = findViewById(R.id.Nomor_tv);
        Jalur_tv = findViewById(R.id.Jalur_tv);

        Intent intent = getIntent();

        Nama_tv.setText(intent.getStringExtra("Nama"));
        Nomor_tv.setText(intent.getStringExtra("Nomor"));
        Jalur_tv.setText(intent.getStringExtra("Jalur"));


    }
}