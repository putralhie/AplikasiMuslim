package com.putralhie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoaActivity extends AppCompatActivity {
    private Button btnDoaBelajar, btnDoaBerpakaian, btnDoaMakan, btnDoaRumah, btnDoaTidur, btnDoaToilet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        btnDoaBelajar = (Button)findViewById(R.id.btn_doa_belajar);
        btnDoaBerpakaian = (Button)findViewById(R.id.btn_doa_berpakaian);
        btnDoaMakan = (Button)findViewById(R.id.btn_doa_makan);
        btnDoaRumah = (Button)findViewById(R.id.btn_doa_rumah);
        btnDoaTidur = (Button)findViewById(R.id.btn_doa_tidur);
        btnDoaToilet = (Button)findViewById(R.id.btn_doa_toilet);

        btnDoaBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaBelajar.class);
                startActivity(intent);
            }
        });

        btnDoaBerpakaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaBerpakaian.class);
                startActivity(intent);
            }
        });

        btnDoaMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaMakan.class);
                startActivity(intent);
            }
        });

        btnDoaRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaRumah.class);
                startActivity(intent);
            }
        });

        btnDoaTidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaTidur.class);
                startActivity(intent);
            }
        });

        btnDoaToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoaActivity.this, DoaToilet.class);
                startActivity(intent);
            }
        });
    }
}
