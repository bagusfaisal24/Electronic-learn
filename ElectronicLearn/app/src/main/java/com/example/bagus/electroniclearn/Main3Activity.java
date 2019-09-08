package com.example.bagus.electroniclearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    GridView grid;
    String[] item = {
            "AC",
            "HANDPHONE",
            "HAIRDYER",
            "SENTER",
            "RADIO",
            "Pembersih_lantai",
            "LAMPU",
            "KOMPUTER",
            "Kipas Angin",
            "TELEVISI",
            "DVD PLAYER",
            "LAPTOP"

    };
    int[] imageId = {
            R.drawable.ac,
            R.drawable.handphone,
            R.drawable.hairdryer,
            R.drawable.senter,
            R.drawable.radio,
            R.drawable.pembersih,
            R.drawable.lampu,
            R.drawable.komputer,
            R.drawable.kipas,
            R.drawable.televisi,
            R.drawable.dvd,
            R.drawable.laptop,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageAdapter adapter = new ImageAdapter(Main3Activity.this, item, imageId);
        grid = (GridView) findViewById(R.id.gridview);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Main3Activity.this, "INI ADALAH " + item[+position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}

