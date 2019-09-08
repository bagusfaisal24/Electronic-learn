package com.example.bagus.electroniclearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class Soal3 extends AppCompatActivity {
    GridView grid;
    Button next;
    String[] web = {
            "BENAR, ini adalah DVD PLAYER",
            "salah, ini adalah MAGIC COM",
            "salah, ini RADIO",
            "salah, ini adalah KOMPUTER"

    };
    int[] imageId = {
            R.drawable.dvd,
            R.drawable.dapur2,
            R.drawable.radio,
            R.drawable.komputer,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);
        ImageAdapter adapter=new ImageAdapter(Soal3.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Soal3.this, "JAWABAN " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}

