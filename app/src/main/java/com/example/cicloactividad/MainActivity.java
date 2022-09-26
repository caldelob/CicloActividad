package com.example.cicloactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnAbrir;
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","6 - Ejecuto onDestroy ACTIVITY 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5 - Ejecuto onStop ACTIVITY 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4 - Ejecuto onPause ACTIVITY 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3 - Ejecuto onResume ACTIVITY 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2 - Ejecuto onStart ACTIVITY 2");
    }




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrir = findViewById(R.id.btnAbrirMain);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Vehículo conductor --> Intent (el objeto encargado de avisar a Android):

                //1. quien quiere abrir una actividad
                //2. Qué actividad quiere abrir

                //Hay dos tipos:
                // - Implícitos: los que abren actividades del sistema (cámara, galería, contactos, teléfonos, etc)
                // - Explícitos: abren una actividad propia

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                startActivity(intent); //es el método para iniciarf el Intent


            }
        });
    }
}