package com.example.bagus.electroniclearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Materi extends AppCompatActivity {
    Button dapur;
    Button ruangan;
    Button mandi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        dapur = (Button)findViewById(R.id.btn1);
        dapur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dapur = new Intent(Materi.this, Main2Activity.class);
                startActivity(dapur);
            }
     });
        ruangan=(Button)findViewById(R.id.btn2);
        ruangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ruangan = new Intent(Materi.this, Main3Activity.class);
                startActivity(ruangan);
            }
        });
        mandi=(Button)findViewById(R.id.btn3);
        mandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mandi = new Intent(Materi.this, Main4Activity.class);
                startActivity(mandi);

            }
        });

    }
}
