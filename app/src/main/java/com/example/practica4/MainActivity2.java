package com.example.practica4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Botones para intents implícitos
        Button btnImplicit1 = findViewById(R.id.btnImplicit1);
        btnImplicit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abrir una página web
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });

        Button btnImplicit2 = findViewById(R.id.btnImplicit2);
        btnImplicit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "¡Hola desde mi app!");
                startActivity(intent);
            }
        });

        Button btnImplicit3 = findViewById(R.id.btnImplicit3);
        btnImplicit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

        Button btnImplicit4 = findViewById(R.id.btnImplicit4);
        btnImplicit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abrir una ubicación en el mapa
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=1600 Amphitheatre Parkway, Mountain View, California");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        // Botones para intents explícitos
        Button btnExplicit1 = findViewById(R.id.btnExplicit1);
        btnExplicit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actualiza el TextView con un mensaje
                TextView txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText("Has pulsado el botón Explícito 1");
            }
        });

        Button btnExplicit2 = findViewById(R.id.btnExplicit2);
        btnExplicit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actualiza el TextView con un mensaje
                TextView txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText("Has pulsado el botón Explícito 2");
            }
        });

        Button btnExplicit3 = findViewById(R.id.btnExplicit3);
        btnExplicit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actualiza el TextView con un mensaje
                TextView txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText("Has pulsado el botón Explícito 3");
            }
        });

        Button btnExplicit4 = findViewById(R.id.btnExplicit4);
        btnExplicit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Actualiza el TextView con un mensaje
                TextView txtResultado = findViewById(R.id.txtResultado);
                txtResultado.setText("Has pulsado el botón Explícito 4");
            }
        });
    }
}
