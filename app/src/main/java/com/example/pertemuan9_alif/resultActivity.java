package com.example.pertemuan9_alif;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String nama = getIntent().getExtras().getString("nama");
        String nim = getIntent().getExtras().getString("nim");
        String jurusan = getIntent().getExtras().getString("jurusan");
        String catatan = getIntent().getExtras().getString("catatan");
        String email = getIntent().getExtras().getString("email");
        String alamat = getIntent().getExtras().getString("alamat");


        result = findViewById(R.id.txt_result);
        result.setText("Nama : " +nama+ "\n\nNim : " +nim+ "\n\nJurusan : " +jurusan+ "\n\nCatatan : " +catatan+ "\n\nEmail : " +email+ "\n\nAlamat : "+alamat);

    }
}