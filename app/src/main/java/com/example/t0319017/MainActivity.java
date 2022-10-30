package com.example.t0319017;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MainFragment mainFragment;
    private DaftarDokterFragment daftarDokterFragment;
    private FragmentManager fragmentManager;
    private TimePickerFragment timePickerFragment;
    private BuatPertemuan buatPertemuan;

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
        this.timePickerFragment = TimePickerFragment.newInstance();
        this.buatPertemuan = buatPertemuan.newInstance();


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
        }
        ft.commit();
        this.drawer.closeDrawers();
    }

    public void closeApplication() {
        this.moveTaskToBack(true);
        this.finish();
    }


}


