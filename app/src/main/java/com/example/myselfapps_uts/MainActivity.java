package com.example.myselfapps_uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

/*
    Tanggal Pengerjaan : 22 Mei 2021
    NIM                : 10118032
    Nama               : Guntur Maulana Ibrahim
    Kelas              : IF1
    Matakuliah         : Aplikasi Komputasi Bergerak

    Membuat aktivity home sebagai tampilan utama dari aplikasi
    Mengganti warna primer, mengganti background semua fragment
    Merombak ulang activity home, di refactor untuk mengubah nama agar mempermudah dan merombak struktru fragment serta buttom navigation
    Menyusun ulang project dan merombak ulang file didalamnya, menghapus drawable file dan layout yang tidak dibutuhkan serta merapikan codingan

*/

    private BottomNavigationView navViewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navViewHome = findViewById(R.id.nav_view);
        setupBottomNavigation(savedInstanceState);
        getSupportActionBar().hide();
    }

    public void buka_map(View view) {
        Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/place/Jl.+Margasari+No.13,+Cijaura,+Kec.+Buahbatu,+Kota+Bandung,+Jawa+Barat+40287/@-6.9564844,107.6536599,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68e83abbf6beef:0x47590d7f94a7ceff!8m2!3d-6.9564897!4d107.6558486"));
        startActivity(map);
    }

    public void buka_ig(View view) {
        Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/gunturmaulana_i/"));
        startActivity(instagram);
    }
    public void buka_fb(View view) {
        Intent blog = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/guntur.ibrahim.5"));
        startActivity(blog);
    }
    public void buka_email(View view) {
        Intent blog = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:gunturmaulanai@gmail.com"));
        startActivity(blog);
    }
    public void buka_dialog(View view) {
        DialogFragment dialogFragment = new DialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "DialogFragment");
    }

    private void setupBottomNavigation(Bundle savedInstanceState) {
        BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
                = item -> {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.home_menu:
                    fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.account_menu:
                    fragment = new AccountFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.gallery_menu:
                    fragment = new GalleryFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.daily_menu:
                    fragment = new DailyFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
                case R.id.music_menu:
                    fragment = new MusicFragment();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container_layout, fragment, fragment.getClass().getSimpleName())
                            .commit();
                    return true;
            }
            return false;
        };
        navViewHome.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        if (savedInstanceState == null) {
            navViewHome.setSelectedItemId(R.id.home_menu);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
