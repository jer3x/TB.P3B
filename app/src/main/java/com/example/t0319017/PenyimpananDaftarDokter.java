package com.example.t0319017;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



public class PenyimpananDaftarDokter {
    protected SharedPreferences sharedPreferences;
    protected final static String NAMA_SHARED_PREF="sp_nilai_display";
    protected final static String KEY_NAMA="NAMA";
    protected final static String KEY_BIDANG="BIDANG";
    protected final static String KEY_NOHP="NOHP";


    public PenyimpananDaftarDokter(Context context){
        this.sharedPreferences = context.getSharedPreferences(NAMA_SHARED_PREF, 0);

    }

    public void saveNama(String nama){
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString(KEY_NAMA, nama);
        editor.commit();

    }
    public String getNama(){
        return sharedPreferences.getString(KEY_NAMA,"");
    }


    public void saveBidang(String bidang){
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString(KEY_BIDANG, bidang);
        editor.commit();

    }
    public String getBidang(){
        return sharedPreferences.getString(KEY_BIDANG,"");
    }


    public void saveNoHp(String nohp){
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        editor.putString(KEY_NOHP, nohp);
        editor.commit();

    }
    public String getNoHp(){
        return sharedPreferences.getString(KEY_NOHP,"");
    }


}


