package com.example.bagus.electroniclearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class Soal2 extends AppCompatActivity {
    GridView grid;
    Button next;
    String[] web = {
            "salah, ini adalah komputer",
            "BENAR, ini laptop",
            "salah, ini adalah radio",
            "salah, ini adalah televisi"

    };
    int[] imageId = {
            R.drawable.komputer,
            R.drawable.laptop,
            R.drawable.radio,
            R.drawable.televisi,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        ImageAdapter adapter=new ImageAdapter(Soal2.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Soal2.this, "JAWABAN " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

        next = (Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(Soal2.this, Soal3.class);
                startActivity(next);

            }
        });

    }

}


