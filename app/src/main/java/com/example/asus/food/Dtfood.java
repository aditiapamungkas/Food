package com.example.asus.food


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by samsung on 10/5/2017.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

class dResep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.R.attr R;
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        getSupportActionBar().setTitle(intent.getStringExtra("Judul"));

        TextView bahan = (TextView) findViewById(R.id.txtBahan);
        TextView step = (TextView) findViewById(R.id.txtStep);
        ImageView gambar = (ImageView) findViewById(R.id.imgResep);

        gambar.setImageResource(intent.getIntExtra("Gambar",0));
        bahan.setText(intent.getStringExtra("Bahan"));
        step.setText(intent.getStringExtra("Step"));
    }
}
