package com.example.bagus.electroniclearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ArrayAdapter<String> adapter = new ArrayAdapter<>( this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.data));
        ListView listView = (ListView)findViewById(R.id.datadiri);
        listView.setAdapter(adapter);
    }
}
