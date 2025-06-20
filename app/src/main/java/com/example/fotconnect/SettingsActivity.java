package com.example.fotconnect;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    Button btnSaveSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        btnSaveSettings = findViewById(R.id.btnSaveSettings);

        btnSaveSettings.setOnClickListener(v ->
                Toast.makeText(SettingsActivity.this, "Settings Saved", Toast.LENGTH_SHORT).show());
    }
}
