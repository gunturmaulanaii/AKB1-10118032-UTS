package com.example.myselfapps_uts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter {
    /*
        Tanggal Pengerjaan : 22 Mei 2021
        NIM                : 10118032
        Nama               : Guntur Maulana Ibrahim
        Kelas              : IF1
        Matakuliah         : Aplikasi Komputasi Bergerak

      Membuat adapter untuk digunakan pada fragment
      Mengubah referensi data sesuai konten
    */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.hari_daily.length;
    }


    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mItemText;
        public ImageView mItemImage;

        public ListViewHolder(View itemView){
            super(itemView);
            mItemText = (TextView) itemView.findViewById(R.id.item_daily_activity);
            mItemImage = (ImageView) itemView.findViewById(R.id.item_daily_image);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            mItemText.setText(OurData.hari_daily[position]);
            mItemImage.setImageResource(OurData.dailyPicturePath[position]);


        }



        @Override
        public void onClick(View v) {

        }
    }

}
