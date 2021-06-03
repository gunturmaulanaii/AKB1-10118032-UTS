package com.example.myselfapps_uts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.myselfapps_uts.entity.AdapterMusic;

public class MusicFragment extends Fragment {

/*
    Tanggal Pengerjaan : 22 Mei 2021
    NIM                : 10118032
    Nama               : Guntur Maulana Ibrahim
    Kelas              : IF1
    Matakuliah         : Aplikasi Komputasi Bergerak

    Membuat aktivity music_fragment untuk logic ketika bottomviewer diklik. juga membuat layout music untuk tampilan fragment
    Mengupdate fragment music serta layoutnya untuk di isi konten
*/



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.music, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_music);
        AdapterMusic listAdapter = new AdapterMusic();
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        VideoView videoView = view.findViewById(R.id.video);
        videoView.setVideoPath("android.resource://"+getActivity().getPackageName()+"/"+R.raw.ic_video);
        MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        return view;
    }


}
