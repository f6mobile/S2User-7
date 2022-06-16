package com.calculate2.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yourhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yourhome);
    }

    public void gonext(View view) {
        Intent intent;
        intent = new Intent(this, Device.class);
        startActivity(intent);
    }
}