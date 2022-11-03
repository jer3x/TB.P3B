package com.example.t0319017;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.io.File;
import java.io.FileWriter;

public class MainActivity extends AppCompatActivity{

    private MainFragment mainFragment;
    private DaftarDokterFragment daftarDokterFragment;
    private FragmentManager fragmentManager;
//    private TimePickerFragment timePickerFragment;
    private BuatPertemuan buatPertemuan;
    private BuatPertemuanDial buatPertemuanDial;
    private PengaturanFragment pengaturanFragment;
    private EditDoctorFragment editDoctorFragment;
    private TambahDokterFragment tambahDokterFragment;

    private PenyimpananDaftarDokter penyimpananDaftarDokter;
    private EditText editTextNama;
    private EditText editTextBidang;
    private EditText editTextNoHp;



    private String file = "com.example.tubes";

    private Toolbar toolbar;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //2. Instantiate the Fragment in Activity
        this.mainFragment = MainFragment.newInstance();
        this.daftarDokterFragment = DaftarDokterFragment.newInstance();
        this.fragmentManager = this.getSupportFragmentManager();
//        this.timePickerFragment = TimePickerFragment.newInstance();
        this.buatPertemuan = buatPertemuan.newInstance();
        this.buatPertemuanDial = BuatPertemuanDial.newInstance();
        this.pengaturanFragment = PengaturanFragment.newInstance();
        this.editDoctorFragment = EditDoctorFragment.newInstance();
        this.daftarDokterFragment = DaftarDokterFragment.newInstance();
        this.tambahDokterFragment = TambahDokterFragment.newInstance();

        this.penyimpananDaftarDokter = new PenyimpananDaftarDokter(this);



        //3. Instantiate FragmentManager
        this.fragmentManager = this.getSupportFragmentManager();

        //4. Use Fragment transaction
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        ft.add(R.id.fragment_container, this.mainFragment).addToBackStack(null).commit();

        this.toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);

        this.drawer = findViewById(R.id.drawer_layout);

        //tombol garis tiga
        ActionBarDrawerToggle abdt = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer);
        this.drawer.addDrawerListener(abdt);
        abdt.syncState();

//        if(savedInstanceState==null){
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new DaftarDokterFragment()).commit();
//        }

    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        this.penyimpananDaftarDokter.saveNama(editTextNama.getText().toString());
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        this.editTextNama.setText(this.penyimpananDaftarDokter.getNama());
//
//    }

//    private void writeFile(File file, String param) {
//        try {
//            file.createNewFile();
//            FileWriter writer = new FileWriter(file);
//            writer.append(param);
//            writer.flush();
//            writer.close();
//        } catch (Exception e) {
//            Log.d("io_error", e.getMessage());
//        }
//        Log.d("storage_path", file.getAbsolutePath());
//    }
//
//    private void storageExternal(String param, String filename, int opt){
//        Log.d("storage_path", Environment.getExternalStorageState());
//        File file = null;
//        if (opt == 1){
//            file = new File(this.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), filename);
//        }
//        this.writeFile(file, param);
//    }
//
//    @Override
//    public void onClick(View v) {
//        if (v == b){
//            String data = "Barang: " + this.namaBarang.getText().toString() + "\n" + "Harga: " + this.hargaBarang.getText().toString() + "\n" + "Keterangan: " + this.keterangan.getText().toString();
//            this.storageExternal(data,"text.txt",1);
//            Log.d("debug", "clicked!");
//
//        }
//    }


    public void changePage(int page) {
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        if (page == 1) {
            if (this.mainFragment.isAdded()) {
                ft.show(this.mainFragment);
            } else {
                ft.add(R.id.fragment_container, this.mainFragment)
                        .addToBackStack(null);
            }
            if (this.daftarDokterFragment.isAdded()) {
                ft.hide(this.daftarDokterFragment);
            }
            if (this.buatPertemuan.isAdded()) {
                ft.hide(this.buatPertemuan);
            }
            if (this.buatPertemuanDial.isAdded()) {
                ft.hide(this.buatPertemuanDial);
            }
            if (this.pengaturanFragment.isAdded()) {
                ft.hide(this.pengaturanFragment);
            }
            if (this.editDoctorFragment.isAdded()) {
                ft.hide(this.editDoctorFragment);
            }
            if (this.tambahDokterFragment.isAdded()) {
                ft.hide(this.tambahDokterFragment);
            }

        } else if (page == 2) {
            if (this.daftarDokterFragment.isAdded()) {
                ft.show(this.daftarDokterFragment);
            } else {
                ft.add(R.id.fragment_container, this.daftarDokterFragment)
                        .addToBackStack(null);
            }
            if (this.buatPertemuan.isAdded()) {
                ft.hide(this.buatPertemuan);
            }
            if (this.mainFragment.isAdded()) {
                ft.hide(this.mainFragment);
            }
            if (this.buatPertemuanDial.isAdded()) {
                ft.hide(this.buatPertemuanDial);
            }
            if (this.pengaturanFragment.isAdded()) {
                ft.hide(this.pengaturanFragment);
            }
            if (this.editDoctorFragment.isAdded()) {
                ft.hide(this.editDoctorFragment);
            }
            if (this.tambahDokterFragment.isAdded()) {
                ft.hide(this.tambahDokterFragment);
            }
        } else if (page == 3) {
            if (this.buatPertemuan.isAdded()) {
                ft.show(this.buatPertemuan);
                ft.hide(this.mainFragment);
            } else {
                ft.add(R.id.fragment_container, this.buatPertemuan)
                        .addToBackStack(null);
            }
            if (this.mainFragment.isAdded()) {
                ft.hide(this.mainFragment);
            }
            if (this.daftarDokterFragment.isAdded()) {
                ft.hide(this.daftarDokterFragment);
            }
            if (this.buatPertemuanDial.isAdded()) {
                ft.hide(this.buatPertemuanDial);
            }
            if (this.pengaturanFragment.isAdded()) {
                ft.hide(this.pengaturanFragment);
            }
            if (this.editDoctorFragment.isAdded()) {
                ft.hide(this.editDoctorFragment);
            }
            if (this.tambahDokterFragment.isAdded()) {
                ft.hide(this.tambahDokterFragment);
            }

        } else if (page == 4){
            if (this.buatPertemuanDial.isAdded()) {
                ft.show(this.buatPertemuanDial);
            } else {
                ft.add(R.id.fragment_container, this.buatPertemuanDial)
                        .addToBackStack(null);
            }
            if (this.buatPertemuan.isAdded()) {
                ft.hide(this.buatPertemuan);
            }
            if (this.daftarDokterFragment.isAdded()) {
                ft.hide(this.daftarDokterFragment);
            }
            if (this.mainFragment.isAdded()) {
                ft.hide(this.mainFragment);
            }
            if (this.pengaturanFragment.isAdded()) {
                ft.hide(this.pengaturanFragment);
            }
            if (this.editDoctorFragment.isAdded()) {
                ft.hide(this.editDoctorFragment);
            }
            if (this.tambahDokterFragment.isAdded()) {
                ft.hide(this.tambahDokterFragment);
            }

        }
        else if (page == 5){
            if (this.pengaturanFragment.isAdded()) {
                ft.show(this.pengaturanFragment);
            } else {
                ft.add(R.id.fragment_container, this.pengaturanFragment)
                        .addToBackStack(null);
            }
            if (this.buatPertemuan.isAdded()) {
                ft.hide(this.buatPertemuan);
            }
            if (this.daftarDokterFragment.isAdded()) {
                ft.hide(this.daftarDokterFragment);
            }
            if (this.mainFragment.isAdded()) {
                ft.hide(this.mainFragment);
            }
            if (this.buatPertemuanDial.isAdded()) {
                ft.hide(this.buatPertemuanDial);
            }
            if (this.editDoctorFragment.isAdded()) {
                ft.hide(this.editDoctorFragment);
            }
            if (this.tambahDokterFragment.isAdded()) {
                ft.hide(this.tambahDokterFragment);
            }

        }

        else if (page == 6){
            if (this.editDoctorFragment.isAdded()) {
                ft.show(this.editDoctorFragment);
            } else {
                ft.add(R.id.fragment_container, this.editDoctorFragment)
                        .addToBackStack(null);
            }
            if (this.daftarDokterFragment.isAdded()) {
                ft.hide(this.daftarDokterFragment);
            }
            if (this.buatPertemuanDial.isAdded()) {
                ft.hide(this.buatPertemuanDial);
            }
            if (this.buatPertemuan.isAdded()) {
                ft.hide(this.buatPertemuan);
            }
            if (this.pengaturanFragment.isAdded()) {
                ft.hide(this.pengaturanFragment);
            }
            if (this.mainFragment.isAdded()) {
                ft.hide(this.mainFragment);
            }
            if (this.tambahDokterFragment.isAdded()) {
                ft.hide(this.tambahDokterFragment);
            }
        }
        else if (page == 7){
            if (this.tambahDokterFragment.isAdded()) {
                ft.show(this.tambahDokterFragment);
            } else {
                ft.add(R.id.fragment_container, this.tambahDokterFragment)
                        .addToBackStack(null);
            }
            if (this.daftarDokterFragment.isAdded()) {
                ft.hide(this.daftarDokterFragment);
            }
            if (this.buatPertemuanDial.isAdded()) {
                ft.hide(this.buatPertemuanDial);
            }
            if (this.buatPertemuan.isAdded()) {
                ft.hide(this.buatPertemuan);
            }
            if (this.pengaturanFragment.isAdded()) {
                ft.hide(this.pengaturanFragment);
            }
            if (this.mainFragment.isAdded()) {
                ft.hide(this.mainFragment);
            }
            if (this.editDoctorFragment.isAdded()) {
                ft.hide(this.editDoctorFragment);
            }
        }

//        else if (page == 7){
//            if (this.editDoctorFragment.isAdded()) {
//                ft.show(this.editDoctorFragment);
//            } else {
//                ft.add(R.id.fragment_container, this.editDoctorFragment)
//                        .addToBackStack(null);
//            }
//            if (this.daftarDokterFragment.isAdded()) {
//                ft.hide(this.daftarDokterFragment);
//            }
//            if (this.buatPertemuanDial.isAdded()) {
//                ft.hide(this.buatPertemuanDial);
//            }
//            if (this.pengaturanFragment.isAdded()) {
//                ft.hide(this.pengaturanFragment);
//            }
//        }

//        else if (page == 7){
//            if (this.editDoctorFragment.isAdded()) {
//                ft.hide(this.buatPertemuan);
//                ft.show(this.editDoctorFragment);
//            } else {
//                ft.add(R.id.fragment_container, this.editDoctorFragment)
//                        .addToBackStack(null);
//            }
//            if (this.daftarDokterFragment.isAdded()) {
//                ft.hide(this.daftarDokterFragment);
//            }
//            if (this.buatPertemuanDial.isAdded()) {
//                ft.hide(this.buatPertemuanDial);
//            }
//            if (this.pengaturanFragment.isAdded()) {
//                ft.hide(this.pengaturanFragment);
//            }
//        }
        ft.commit();
        this.drawer.closeDrawers();
    }

    public void closeApplication() {
        this.moveTaskToBack(true);
        this.finish();
    }
}



