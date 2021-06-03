package com.example.myselfapps_uts.entity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myselfapps_uts.OurData;
import com.example.myselfapps_uts.R;

public class AdapterMusic extends RecyclerView.Adapter {
/*
     Tanggal Pengerjaan : 22 Mei 2021
     NIM                : 10118032
     Nama               : Guntur Maulana Ibrahim
     Kelas              : IF1
     Matakuliah         : Aplikasi Komputasi Bergerak

     Membuat adapter untuk digunakan pada fragment music
*/
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return com.example.myselfapps_uts.OurData.title_music.length;
    }


    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mItemText;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.item_music_text);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            mItemText.setText(com.example.myselfapps_uts.OurData.title_music[position]);
        }

        @Override
        public void onClick(View v) {

        }
    }

}
