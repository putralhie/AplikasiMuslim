package com.putralhie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSholat;
    private Button btnHalal;
    private Button btnDoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSholat =(Button)findViewById(R.id.btn_sholat);
        btnHalal = (Button)findViewById(R.id.btn_halal);
        btnDoa = (Button)findViewById(R.id.btn_doa);

        btnSholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ali = new Intent(MainActivity.this, ShalatActivity.class);
                startActivity(ali);
            }
        });

        btnHalal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ali = new Intent(MainActivity.this, HalalActivity.class);
                startActivity(ali);
            }
        });

        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ali = new Intent(MainActivity.this, DoaActivity.class);
                startActivity(ali);
            }
        });
    }
}
