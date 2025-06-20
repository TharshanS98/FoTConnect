package com.example.fotconnect;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    TextView textSignUp;
    Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        // Link to SignUp screen
        textSignUp = findViewById(R.id.textSignUp);
        textSignUp.setOnClickListener(v -> {
            Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
            startActivity(intent);
        });

        // Handle sign in button
        signInButton = findViewById(R.id.signInButton);
        signInButton.setOnClickListener(v -> {
            // In future: Validate email and password
            Intent intent = new Intent(SignInActivity.this, NewsActivity.class);
            startActivity(intent);
        });
    }
}
