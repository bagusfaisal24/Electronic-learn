package com.example.bagus.electroniclearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    GridView grid;
    String[] web = {
            "POMPA AIR",
            "MESIN CUCI"

    };
    int[] imageId = {
            R.drawable.pompa,
            R.drawable.mesincuci,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ImageAdapter adapter = new ImageAdapter(Main4Activity.this, web, imageId);
        grid = (GridView) findViewById(R.id.gridview);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Main4Activity.this, "INI ADALAH " + web[+position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}