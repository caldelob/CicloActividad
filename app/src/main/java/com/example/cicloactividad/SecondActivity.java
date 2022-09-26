package com.example.cicloactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btnCerrar;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","6 - Ejecuto onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5 - Ejecuto onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4 - Ejecuto onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3 - Ejecuto onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2 - Ejecuto onStart");
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        btnCerrar = findViewById(R.id.btnCerrarSecond);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}