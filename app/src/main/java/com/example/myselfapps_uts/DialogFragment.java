package com.example.myselfapps_uts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DialogFragment extends androidx.fragment.app.DialogFragment {

    /*
        Tanggal Pengerjaan : 22 Mei 2021
        NIM                : 10118032
        Nama               : Guntur Maulana Ibrahim
        Kelas              : IF1
        Matakuliah         : Aplikasi Komputasi Bergerak

        Membuat fragment dialog fragment
    */
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            super.onCreateView(inflater,container,savedInstanceState);
            View view = inflater.inflate(R.layout.dialog_version, container, false);
            return view;
        }




}

