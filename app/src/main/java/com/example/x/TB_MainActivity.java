package com.example.x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class TB_MainActivity extends AppCompatActivity {

    Spinner TB_miktar;
    EditText TB_isim, TB_fiyat, TB_aciklama;
    Button TB_liste;
    ArrayList<TB_Urun> TB_urunler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TB_isim = findViewById(R.id.TB_editTextTextPersonName);
        TB_fiyat = findViewById(R.id.TB_editTextTextPersonName2);
        TB_aciklama = findViewById(R.id.TB_editTextTextPersonName3);
        TB_miktar = findViewById(R.id.spinner);
        TB_urunler = new ArrayList<>();

        TB_liste = findViewById(R.id.button2);
        TB_liste.setOnClickListener(v -> {
            Intent intent = new Intent(TB_MainActivity.this, TB_ListAct.class);
            intent.putExtra("TB_urunler", TB_urunler);
            startActivity(intent);
        });
    }

    public void TB_buttonClick(View view) {
        TB_Urun TB_urun = new TB_Urun(getApplicationContext(), TB_isim.getText().toString(),
                TB_aciklama.getText().toString(),
                TB_miktar.getSelectedItem().toString(),
                Double.parseDouble(TB_fiyat.getText().toString()));
        TB_urun.setTB_fiyat(Double.parseDouble(TB_fiyat.getText().toString()));
        TB_urunler.add(TB_urun);
        Toast.makeText(getApplicationContext(), "ürün sayısı " +
                TB_urunler.size() + "  - eklenen  --> " + TB_urunler.get(TB_urunler.size() - 1).getTB_isim(), Toast.LENGTH_LONG).show();
    }
}
