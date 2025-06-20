package com.example.fotconnect;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NewsDetailsActivity extends AppCompatActivity {

    TextView detailTitle, detailContent;
    ImageView detailImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        detailTitle = findViewById(R.id.detailTitle);
        detailContent = findViewById(R.id.detailContent);
        detailImage = findViewById(R.id.detailImage);

        // Get data from Intent
        String title = getIntent().getStringExtra("title");
        String content = getIntent().getStringExtra("content");
        int imageResId = getIntent().getIntExtra("imageResId", -1);

        // Set data
        detailTitle.setText(title);
        detailContent.setText(content);
        if (imageResId != -1) {
            detailImage.setImageResource(imageResId);
        }
    }
}
