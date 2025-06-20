package com.example.fotconnect;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    Button buttonGetStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        buttonGetStart = findViewById(R.id.buttonGetStart);

        buttonGetStart.setOnClickListener(v -> {
            Intent intent = new Intent(SplashActivity.this, SignInActivity.class); // clearly updated
            startActivity(intent);
            finish();
        });
    }
}
