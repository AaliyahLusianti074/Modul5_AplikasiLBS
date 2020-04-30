package com.example.mapsschool4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void masukmaps(View v){
        Intent i = new Intent(MenuActivity.this, MapsActivity.class);
        startActivity(i);
    }
    public void masukmaps2(View v) {
        Intent i = new Intent(MenuActivity.this, MapsActivity2.class);
        startActivity(i);
    }
}
