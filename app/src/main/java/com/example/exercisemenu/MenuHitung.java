package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MenuHitung extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hitung);

    }

    //GA PAHAM NGGA DIKASIH TAU DI MATERI GIMANA CARANYA DALAM SATU ACTIVITYMAIN BISA BUAT NGELINK POPUP
    //KE GAMBAR TRUS DI GAMBAR ADA DUA OPTION MENU YANG KETIKA DI KLIK HARUS PINDAH KE PAGE YANG BERSANGKUTAN
    // DIAJARIN OPTION MENU CUMAN SATU DOANG, ITU AJA MAHAMINNYA RADA SUSAH, EH INI KEK GINI
    // UDH CARI DI YUTUBE GIMANA CARA BIAR BISA, DR JAM 2 SIANG SAMPE JAM 2 MALEM STUCK DISINI DOANG, SAMPE BINGUNG MAU NGASIH RUMUS LUAS SAM KELILING DI PAGE YANG LAIN
    //SEBELUMNYA MOHON MAAF BANG/MAS/MBA/PAK, KALAU NGASIH TUGAS SUSAH TAPI ADA MAETERINYA SANGGUP SAYA 100%, KALAU GINI SAMPE JAMAN GANTI KE
    //ZAMAN BATU LAGI YA SAYA SUSAH PAHAM DAN SUSAH NYARI MATERINYA


    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.optionmenu);
        popup.show();

    }


    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.m1:
                Toast.makeText(getApplicationContext(), "Luas Persegi", Toast.LENGTH_SHORT).show();
                Intent persegi1 = new Intent(MenuHitung.this, Persegi1.class);
                MenuHitung.this.startActivity(persegi1);
                finish();
                return true;
            case R.id.m2:
                Toast.makeText(getApplicationContext(), "Keliling Persegi", Toast.LENGTH_SHORT).show();
                Intent persegi2 = new Intent(MenuHitung.this, Persegi2.class);
                MenuHitung.this.startActivity(persegi2);
                finish();
                return true;
            default:
                return false;
        }
    }

}
