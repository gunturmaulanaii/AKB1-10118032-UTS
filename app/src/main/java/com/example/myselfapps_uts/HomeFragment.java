package com.example.myselfapps_uts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
/*
    Tanggal Pengerjaan : 22 Mei 2021
    NIM                : 10118032
    Nama               : Guntur Maulana Ibrahim
    Kelas              : IF1
    Matakuliah         : Aplikasi Komputasi Bergerak

    Membuat aktivity home_fragment untuk logic ketika bottomviewer diklik. juga membuat layout home untuk tampilan fragment
    Mengerjakan layout home fragment berisi profil dan hobi, mengisi konten fragment home berupa deskripsi diri, profile, dan interest
*/



        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.home, container, false);
            return view;
        }
    }
