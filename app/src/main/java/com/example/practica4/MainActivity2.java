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
        Button btnAbrirWeb = findViewById(R.id.btnImplicit1);
        btnAbrirWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri webpage = Uri.parse("https://www.google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    mostrarMensaje("No se puede abrir la web. ¡Instala un navegador!");
                }
            }
        });

        Button btnCompartirTexto = findViewById(R.id.btnImplicit2);
        btnCompartirTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "¡Hola desde mi app! #AndroidMagic");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    mostrarMensaje("No se puede compartir el texto. ¿Tienes aplicaciones de redes sociales instaladas?");
                }
            }
        });

        Button btnTomarFoto = findViewById(R.id.btnImplicit3);
        btnTomarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    mostrarMensaje("No se puede abrir la cámara. ¿Tienes una cámara instalada?");
                }
            }
        });

        Button btnMapa = findViewById(R.id.btnImplicit4);
        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=1600 Amphitheatre Parkway, Mountain View, California");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    mostrarMensaje("No se puede abrir el mapa. Asegúrate de tener Google Maps instalado.");
                }
            }
        });


        Button btnExpl1 = findViewById(R.id.btnExplicit1);
        btnExpl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarMensaje("¡Has desbloqueado el logro Explícito 1! 🏆");
            }
        });

        Button btnExpl2 = findViewById(R.id.btnExplicit2);
        btnExpl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarMensaje("¡Has desbloqueado el logro Explícito 2! 🏅");
            }
        });

        Button btnExpl3 = findViewById(R.id.btnExplicit3);
        btnExpl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarMensaje("¡Has desbloqueado el logro Explícito 3! 🎉");
            }
        });

        Button btnExpl4 = findViewById(R.id.btnExplicit4);
        btnExpl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarMensaje("¡Has desbloqueado el logro Explícito 4! 🌟");
            }
        });
    }


    private void mostrarMensaje(String mensaje) {
        TextView txtResultado = findViewById(R.id.txtResultado);
        txtResultado.setText(mensaje);
    }
}
