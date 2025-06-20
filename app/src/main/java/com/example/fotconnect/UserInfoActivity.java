package com.example.fotconnect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class UserInfoActivity extends AppCompatActivity {

    Button btnEditInfo, btnExit;
    TextView textUsername, textEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        btnEditInfo = findViewById(R.id.btnEditInfo);
        btnExit = findViewById(R.id.btnExit);
        textUsername = findViewById(R.id.textUsername);
        textEmail = findViewById(R.id.textEmail);

        // ✅ Edit Info Popup Dialog
        btnEditInfo.setOnClickListener(v -> showEditDialog());

        // ✅ Exit Confirmation Dialog
        btnExit.setOnClickListener(v -> showExitConfirmation());
    }

    private void showExitConfirmation() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Really want to exit?");
        builder.setCancelable(true);

        builder.setPositiveButton("Ok", (dialog, which) -> {
            finishAffinity(); // Exit app
        });

        builder.setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss());

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showEditDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_edit_info, null);
        builder.setView(dialogView);

        AlertDialog dialog = builder.create();

        EditText editUsername = dialogView.findViewById(R.id.editUsername);
        EditText editEmail = dialogView.findViewById(R.id.editEmail);
        Button btnOk = dialogView.findViewById(R.id.btnOk);
        Button btnCancel = dialogView.findViewById(R.id.btnCancel);

        btnOk.setOnClickListener(v -> {
            String newUsername = editUsername.getText().toString().trim();
            String newEmail = editEmail.getText().toString().trim();

            // Optional: Validate input here
            if (!newUsername.isEmpty()) {
                textUsername.setText("Username : " + newUsername);
            }
            if (!newEmail.isEmpty()) {
                textEmail.setText("Email: " + newEmail);
            }

            dialog.dismiss();
        });

        btnCancel.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }
}
