package com.example.cas2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // onCreate() wird automatisch von Android beim
    // Starten der Activity aufgerufen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Verbindung zum XML-Layout herstellen
        // bzw. das UI der Activity wird dargestellt
        setContentView(R.layout.activity_main)
    }

    private fun myFunction(): String {
        return "Hello!"
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