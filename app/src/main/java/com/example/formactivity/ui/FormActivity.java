package com.example.formactivity.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.formactivity.R;

public class FormActivity extends AppCompatActivity {

    TextView nama, nim, email, hp, jkel, prodi, ukm;
    String getnama, getnim, getemail, gethp, getprodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //Inisiasi seperti yang di java MainActivity
        nama = findViewById(R.id.namatext);
        nim = findViewById(R.id.nimtext);
        email = findViewById(R.id.emailtext);
        hp = findViewById(R.id.hptext);
        jkel = findViewById(R.id.jk);
        prodi = findViewById(R.id.prod);
        ukm = findViewById(R.id.ukm);

        //Proses menerima data
        Bundle bundle = getIntent().getExtras();
        getnama = bundle.getString("nama");
        getnim = bundle.getString("nim");
        getemail = bundle.getString("email");
        gethp = bundle.getString("hp");
        getprodi = bundle.getString("prodi");

        //Proses menampilkan data
        nama.setText("Nama : "+getnama);
        nim.setText("Nim : "+getnim);
        email.setText("Email : "+getemail);
        hp.setText("HP : "+gethp);
        prodi.setText(": "+getprodi);

        Intent tampilkanIntent = getIntent();
        Bundle bukaPaket = tampilkanIntent.getExtras();
        String jk = bukaPaket.getString("jenkel");
        String UKM = bukaPaket.getString("UKM");
        jkel.setText(": "+jk);
        ukm.setText(": "+UKM);

    }
}