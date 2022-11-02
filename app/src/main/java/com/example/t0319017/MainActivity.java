package com.example.t0319017;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private MainFragment mainFragment;
    private DaftarDokterFragment daftarDokterFragment;
    private FragmentManager fragmentManager;
//    private TimePickerFragment timePickerFragment;
    private BuatPertemuan buatPertemuan;
    private BuatPertemuanDial buatPertemuanDial;
    private PengaturanFragment pengaturanFragment;
    private EditDoctorFragment editDoctorFragment;
    private TambahDokterFragment tambahDokterFragment;

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



