package com.quinto.pe3quintojustinramille;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void previousPage(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
