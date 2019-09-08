package com.example.bagus.electroniclearn;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import static com.example.bagus.electroniclearn.R.styleable.View;

public class Soal extends AppCompatActivity {
    GridView grid;
    Button next;
    String[] web = {
            "salah, ini adalah MIXER",
            "salah, ini adalah MAGIC COM",
            "BENAR, ini OVEN",
            "salah, ini adalah DISPENSER"

    };
    int[] imageId = {
            R.drawable.dapur1,
            R.drawable.dapur2,
            R.drawable.dapur3,
            R.drawable.dapur5,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        ImageAdapter adapter=new ImageAdapter(Soal.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Soal.this, "JAWABAN " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
        next = (Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Soal.this, Soal2.class);
                startActivity(next);

            }
        });
    }

}


