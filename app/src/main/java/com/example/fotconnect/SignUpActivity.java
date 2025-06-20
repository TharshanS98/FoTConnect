package com.example.fotconnect;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    Button signUpButton;
    TextView textSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signUpButton = findViewById(R.id.signUpButton);
        textSignIn = findViewById(R.id.textSignIn);

        // After clicking Sign Up, go to Sign In screen
        signUpButton.setOnClickListener(v -> {
            // Here you can add sign up logic or validation
            // For now, go to sign in
            Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
            startActivity(intent);
            finish(); // Optional: close sign up screen
        });

        textSignIn.setOnClickListener(v -> {
            Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
