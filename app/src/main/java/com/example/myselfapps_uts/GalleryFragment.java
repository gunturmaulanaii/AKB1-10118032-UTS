package com.example.myselfapps_uts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myselfapps_uts.entity.LocalImages;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {
    /*
    Tanggal Pengerjaan : 22 Mei 2021
    NIM                : 10118032
    Nama               : Guntur Maulana Ibrahim
    Kelas              : IF1
    Matakuliah         : Aplikasi Komputasi Bergerak

    Membuat fragment gallery_fragment untuk logic ketika bottomviewer diklik. juga membuat layout home untuk tampilan fragment
    Membuat fragment gallery serta logic untuk menampilkan gambarnya.
   */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        setupRecyclerView(view);
        return view;
    }

    private void setupRecyclerView(View view) {
        ArrayList<LocalImages> data = new ArrayList<>();

        data.add(new LocalImages(R.drawable.gallery_1));
        data.add(new LocalImages(R.drawable.gallery_2));
        data.add(new LocalImages(R.drawable.gallery_3));
        data.add(new LocalImages(R.drawable.gallery_4));
        data.add(new LocalImages(R.drawable.gallery_5));
        data.add(new LocalImages(R.drawable.gallery_6));
        data.add(new LocalImages(R.drawable.gallery_7));
        data.add(new LocalImages(R.drawable.gallery_8));
        data.add(new LocalImages(R.drawable.gallery_9));


        RecyclerView rvFavorite = view.findViewById(R.id.rv_favorite);
        com.example.myselfapps_uts.LocalImageAdapter adapter = new com.example.myselfapps_uts.LocalImageAdapter(data, getContext());
        rvFavorite.setHasFixedSize(true);
        rvFavorite.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        rvFavorite.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }
}