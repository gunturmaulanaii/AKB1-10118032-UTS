package com.example.myselfapps_uts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DailyFragment extends Fragment {
    /*
        Tanggal Pengerjaan : 22 Mei 2021
        NIM                : 10118032
        Nama               : Guntur Maulana Ibrahim
        Kelas              : IF1
        Matakuliah         : Aplikasi Komputasi Bergerak

        Membuat aktivity daily_fragment untuk logic ketika bottomviewer diklik. juga membuat layout daily untuk tampilan fragment
        Mengupdate daily fragment untuk diterapkan 2 recycler view
        Mengubah recyclerview kedua menjadi horizontal
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.daily, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_daily1);
        com.example.myselfapps_uts.ListAdapter listAdapter = new com.example.myselfapps_uts.ListAdapter();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recycler_view_daily2);
        ListAdapter2 listAdapter2 = new ListAdapter2();
        recyclerView2.setAdapter(listAdapter2);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);

        recyclerView2.setLayoutManager(horizontalLayoutManager);

        return view;
    }
}
