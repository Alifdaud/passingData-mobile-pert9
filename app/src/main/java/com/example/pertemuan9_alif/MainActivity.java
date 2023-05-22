package com.example.pertemuan9_alif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText nama, nim, catatan, email, alamat;
    RadioGroup jurusan;
    RadioButton namajurusan;
    Button kirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.ednama);
        nim = findViewById(R.id.ednim);
        jurusan = findViewById(R.id.rjurusan);
        catatan = findViewById(R.id.edcatatan);
        email = findViewById(R.id.edemail);
        alamat = findViewById(R.id.edalamat);
        kirim = findViewById(R.id.btn_kirim);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = jurusan.getCheckedRadioButtonId();

                namajurusan = (RadioButton) findViewById(radioId);

                Intent i = new Intent(MainActivity.this, resultActivity.class);
                i.putExtra("nama", nama.getText().toString());
                i.putExtra("nim", nim.getText().toString());
                i.putExtra("jurusan", namajurusan.getText().toString());
                i.putExtra("catatan", catatan.getText().toString());
                i.putExtra("email", email.getText().toString());
                i.putExtra("alamat", alamat.getText().toString());

                startActivity(i);
            }
        });
    }
}