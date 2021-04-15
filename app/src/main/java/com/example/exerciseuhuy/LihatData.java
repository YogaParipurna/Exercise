package com.example.exerciseuhuy;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LihatData extends AppCompatActivity {
    static  TextView tvnama;
    static  TextView tvnomor;
    String nama;
    public static String nomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihatdata);

        Bundle b = getIntent().getExtras();
        nama = b.getString("a");

        tvnama = (TextView) findViewById(R.id.tvNamaKontak);
        tvnomor = (TextView) findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Yoga":
                tvnama.setText("Yoga Paripurna");
                tvnomor.setText("000000");
                nomor = tvnomor.getText().toString();
                break;
            case "Bagus":
                tvnama.setText("Bagus Rinu");
                tvnomor.setText("111111");
                nomor = tvnomor.getText().toString();
                break;
            case "Vicky":
                tvnama.setText("M Vicky");
                tvnomor.setText("222222");
                nomor = tvnomor.getText().toString();
                break;
            case "Fuad":
                tvnama.setText("Fuad Rizkani");
                tvnomor.setText("333333");
                nomor = tvnomor.getText().toString();
                break;
            case "Rivky":
                tvnama.setText("Rivky Riantoro");
                tvnomor.setText("444444");
                nomor = tvnomor.getText().toString();
                break;
            case "Ilham":
                tvnama.setText("Ilham Ramdhani");
                tvnomor.setText("555555");
                nomor = tvnomor.getText().toString();
                break;
            case "Bagas":
                tvnama.setText("Bagas Wahyu Wijaya");
                tvnomor.setText("666666");
                nomor = tvnomor.getText().toString();
                break;
        }
    }
}