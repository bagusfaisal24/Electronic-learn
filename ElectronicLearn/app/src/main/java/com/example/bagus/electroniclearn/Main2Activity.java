package com.example.bagus.electroniclearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    GridView grid;
    String[] web = {
            "MIXER",
            "MAGIC COM",
            "OVEN",
            "KOMPOR LISTRIK",
            "DISPENSER"

    };
    int[] imageId = {
            R.drawable.dapur1,
            R.drawable.dapur2,
            R.drawable.dapur3,
            R.drawable.dapur4,
            R.drawable.dapur5,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageAdapter adapter=new ImageAdapter(Main2Activity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(Main2Activity.this, "INI ADALAH " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}