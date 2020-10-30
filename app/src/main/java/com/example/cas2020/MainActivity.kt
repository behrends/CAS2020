package com.example.cas2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // onCreate() wird automatisch von Android beim
    // Starten der Activity aufgerufen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Verbindung zum XML-Layout herstellen
        // bzw. das UI der Activity wird dargestellt
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        // Button anklicken soll TextView  ändern
        // 1. Button-View-Element aus XML einer Konstanten zuweisen
        val button = findViewById<Button>(R.id.button)
        // 2. Button mit Klick-Handler ausstatten
        button.setOnClickListener {
            Toast.makeText(this, "OK HAT GEKLAPPT!", Toast.LENGTH_LONG).show()
            textView.text = "WURDE GEÄNDERT"
        }
    }
}

/* JAVA:
public class MainActivity extends AppCompatActivity {

    @override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Verbindung zum XML-Layout herstellen
        // bzw. das UI der Activity wird dargestellt
        setContentView(R.layout.activity_main);
    }
}
 */