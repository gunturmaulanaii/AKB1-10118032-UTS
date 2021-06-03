package com.example.myselfapps_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myselfapps_uts.R;
import com.example.myselfapps_uts.Welcome;

public class SplashScreen extends AppCompatActivity {
    /*
        Tanggal Pengerjaan : 22 Mei 2021
        NIM                : 10118032
        Nama               : Guntur Maulana Ibrahim
        Kelas              : IF1
        Matakuliah         : Aplikasi Komputasi Bergerak

        Membuat activity splash screen untuk menampilkan layout splash screen selama 4 detik kemudian pindah ke activity welcome
      */
    private int waktu_loading=2000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent welcome=new Intent(SplashScreen.this, Welcome.class);
                startActivity(welcome);
                finish();

            }
        },waktu_loading);
    }
}