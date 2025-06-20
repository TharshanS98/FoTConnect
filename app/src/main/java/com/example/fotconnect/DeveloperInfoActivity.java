package com.example.fotconnect;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DeveloperInfoActivity extends AppCompatActivity {

    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_info);

        btnExit = findViewById(R.id.btnExit);

        // Set click listener for the Exit button
        btnExit.setOnClickListener(v -> showExitConfirmation());
    }

    private void showExitConfirmation() {
        // Create the confirmation dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Really want to exit?");
        builder.setCancelable(true);

        builder.setPositiveButton("Ok", (dialog, which) -> {
            finishAffinity(); // Exit the app
        });

        builder.setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss());

        // Show the dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
