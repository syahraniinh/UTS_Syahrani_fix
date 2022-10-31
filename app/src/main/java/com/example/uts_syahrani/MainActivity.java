package com.example.uts_syahrani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_nama, et_nomor;
    Button btn_daftar;
    CheckBox confirm;
    Spinner jalur_pd;

    String namaLengkap, nomorPendaftaran, jalurDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nama = findViewById(R.id.et_nama);
        et_nomor = findViewById(R.id.et_nomor);
        btn_daftar = findViewById(R.id.btn_daftar);
        confirm = findViewById(R.id.confirm);
        jalur_pd = findViewById(R.id.jalur_pd);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namaLengkap = et_nama.getText().toString();
                nomorPendaftaran = et_nomor.getText().toString();
                jalurDaftar = jalur_pd.getSelectedItem().toString();

                if (namaLengkap.trim().equals("")){
                    et_nama.setError("Nama tidak boleh kosong");
                }
                else if (nomorPendaftaran.trim().equals("")){
                    et_nomor.setError("Nomor pendaftaran tidak boleh kosong");
                } else{
                    Intent intent = new Intent(MainActivity.this, KonfirmasiActivity.class);
                    intent.putExtra("Nama", namaLengkap);
                    intent.putExtra("Nomor", nomorPendaftaran);
                    intent.putExtra("Jalur", jalurDaftar);
                    startActivity(intent);
                }
            }
        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (confirm.isChecked()) {
                    Toast.makeText(MainActivity.this, "Checkbox is Checked", Toast.LENGTH_SHORT).show();
                } else if (!confirm.isChecked()){
                    Toast.makeText(MainActivity.this, "Checkbox is not Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}