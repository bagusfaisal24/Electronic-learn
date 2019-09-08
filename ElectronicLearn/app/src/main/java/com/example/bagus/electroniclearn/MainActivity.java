package com.example.bagus.electroniclearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button materi;
    Button about;
    Button petunjuk;
    Button latihan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        materi = (Button)findViewById(R.id.btn2);
        materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent materi = new Intent(MainActivity.this, Materi.class);
                startActivity(materi);
            }
        });
        about = (Button)findViewById(R.id.btn5);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, About.class);
                startActivity(about);

            }
        });
        petunjuk = (Button)findViewById(R.id.btn6);
        petunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent petunjuk = new Intent(MainActivity.this, Petunjuk.class);
                startActivity(petunjuk);

            }
        });
        latihan = (Button)findViewById(R.id.btn3);
        latihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent latihan = new Intent(MainActivity.this, Soal.class);
                startActivity(latihan);

            }
        });



    }

}
