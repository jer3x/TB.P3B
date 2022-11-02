package com.example.t0319017;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileWriter;

public class SaveToFileNewDoctor extends AppCompatActivity implements View.OnClickListener{
    private PenyimpananDaftarDokter pencatat;
    private EditText namaDoktor;
    private EditText bidangDoktor;
    private EditText noHp;
    private Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tambahdokter_fragment);

        this.pencatat = new PenyimpananDaftarDokter(this);
        this.namaDoktor = findViewById(R.id.et_name);
        this.bidangDoktor = findViewById(R.id.et_bid);
        this.noHp = findViewById(R.id.et_hp);
        this.save = findViewById(R.id.buttonSIMPANTAMBAHDOKTER);
        this.save.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.pencatat.saveNama(namaDoktor.getText().toString());
        this.pencatat.saveBidang(bidangDoktor.getText().toString());
        this.pencatat.saveNoHp(noHp.getText().toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.namaDoktor.setText(this.pencatat.getNama());
        this.bidangDoktor.setText(this.pencatat.getBidang());
        this.noHp.setText(this.pencatat.getNoHp());
    }

    private void writeFile(File file, String param) {
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.append(param);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            Log.d("io_error", e.getMessage());
        }
        Log.d("storage_path", file.getAbsolutePath());
    }

    private void storageExternal(String param, String filename, int opt){
        Log.d("storage_path", Environment.getExternalStorageState());
        File file = null;
        if (opt == 1){
            file = new File(this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), filename);
        }
        this.writeFile(file, param);
    }

    @Override
    public void onClick(View v) {
        if (v == save){
            String data = "Nama Dokter: " + this.namaDoktor.getText().toString() + "\n" + "Bidang Dokter: " + this.bidangDoktor.getText().toString() + "\n" + "No Hp: " + this.noHp.getText().toString();
            this.storageExternal(data,"DokterBaru.txt",1);
            Log.d("debug", "Berhasil Menyimpan Data Dokter Baru");

        }
    }

}
