package com.example.asus.food;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] judul_resep,penjelasan_resep,bahan_resep,step_resep;
    RecyclerView recyclerView;
    boolean doubleBackToExitPressedOnce = false;

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Klik sekali lagi", Toast.LENGTH_SHORT).show();
    }

    private class RecyclerView {
        public void setLayoutManager(LinearLayoutManager linearLayoutManager) {
        }
    }

    private class LinearLayoutManager {
        public LinearLayoutManager(MainActivity mainActivity) {
        }
    }
}

}
