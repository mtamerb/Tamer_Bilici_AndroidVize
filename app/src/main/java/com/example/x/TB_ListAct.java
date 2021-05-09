package com.example.x;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TB_ListAct extends AppCompatActivity {
    ListView TB_myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<TB_Urun> urunler = (ArrayList<TB_Urun>) getIntent().getSerializableExtra("urun");
        Toast.makeText(TB_ListAct.this, urunler.get(0).getTB_isim(), Toast.LENGTH_LONG).show();
    }
} 