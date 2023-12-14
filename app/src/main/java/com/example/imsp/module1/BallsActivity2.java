package com.example.imsp.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BallsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new BallsView(this));
    }
}