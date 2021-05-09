package com.example.x;

import android.content.Context;
import android.widget.Toast;

import java.io.Serializable;

public class TB_Urun implements Serializable {
    String TB_isim;
    String TB_aciklama;
    String TB_miktar;
    double TB_fiyat;
    Context context;

    public void setContex(Context context) {
        this.context = context;
    }

    public TB_Urun(Context cOntext, String TB_isim, String TB_aciklama, String TB_miktar, double TB_fiyat) {
        this.TB_isim = TB_isim;
        this.TB_aciklama = TB_aciklama;
        this.TB_miktar = TB_miktar;
        this.TB_fiyat = TB_fiyat;
    }

    public String getTB_isim() {
        return TB_isim;
    }

    public void setTB_isim(String TB_isim) {
        this.TB_isim = TB_isim;
    }

    public String getTB_aciklama() {
        return TB_aciklama;
    }

    public void setTB_aciklama(String TB_aciklama) {
        this.TB_aciklama = TB_aciklama;
    }

    public String getTB_miktar() {
        return TB_miktar;
    }

    public void setTB_miktar(String TB_miktar) {
        this.TB_miktar = TB_miktar;
    }

    public double getTB_fiyat() {
        return TB_fiyat;
    }

    public void setTB_fiyat(double TB_fiyat) {
        if (TB_fiyat < 0) {
            if (context != null) {
                Toast.makeText(context, " fiyat negatif olamaz ...", Toast.LENGTH_LONG).show();
            } this.TB_fiyat = 0.0;
        } else {
            this.TB_fiyat = TB_fiyat;
        }
    }
}
