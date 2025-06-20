package com.example.fotconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    ImageView iconSports, iconAcademic, iconEvents, menuButton;
    TextView news1Title, news2Title, news3Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        // Bottom nav icons
        iconSports = findViewById(R.id.iconSports);
        iconAcademic = findViewById(R.id.iconAcademic);
        iconEvents = findViewById(R.id.iconEvents);
        menuButton = findViewById(R.id.menuButton);

        // News titles
        news1Title = findViewById(R.id.news1Title);
        news2Title = findViewById(R.id.news2Title);
        news3Title = findViewById(R.id.news3Title); // ✅ FIXED ID in XML

        // News 1 click
        news1Title.setOnClickListener(v -> {
            Intent intent = new Intent(NewsActivity.this, NewsDetailsActivity.class);
            intent.putExtra("title", "UOC Enhances Cricket Opportunities with the Newly Constructed Turf Side Wickets");
            intent.putExtra("content", "The newly constructed turf side wickets of the University of Colombo were declared on 26th May 2023, with the purpose of providing students the opportunity to enhance their cricket skills and foster a vibrant sporting culture within the university. This remarkable facility was made possible through the patronage of the Sri Lanka Cricket and Western Province Cricket Association, reflecting their commitment to promoting the growth of cricket at the university level.\n\nThe opening ceremony was graced by the presence of the Vice Chancellor of the University, Senior Professor (Chair) H.D. Karunaratne, Chairman of the Sports Advisory Board, Dr Kapila Bandara, and Secretary of the Western Province Cricket Association, Mr Aruna Weerasinghe. Additionally, the Registrar of the University, Mr K.A.S. Edward, the Director of the Sports and Exercise Medicine Unit, Dr Chathuranga Ranasinghe, the Acting Director of the Department of Physical Education, Mr Sanjeewa Jayasinghe, as well as all the Physical Education instructors, members of the Amalgamated Club, and the members of the university cricket team were present at the event.");
            intent.putExtra("imageResId", R.drawable.news1);
            startActivity(intent);
        });

        // News 2 click
        news2Title.setOnClickListener(v -> {
            Intent intent = new Intent(NewsActivity.this, NewsDetailsActivity.class);
            intent.putExtra("title", "Student Awards");
            intent.putExtra("content", "Awards are presented to eligible students who have successfully completed their degree programmes. There are four “open awards” which students in all Faculties compete for:\n\n" +
                    "1. The Student of the Year award\n" +
                    "2. The D. P. P. Samarasekera Peace Prize\n" +
                    "3. The Canekeratne Prize for General Merit\n" +
                    "4. Thilak Hettiarachchi Award for Academic Excellence\n\n" +
                    "These awards recognize academic excellence, leadership, sportsmanship, social harmony efforts, and outstanding extracurricular involvement.");
            intent.putExtra("imageResId", R.drawable.news2);
            startActivity(intent);
        });

        // News 3 click
        news3Title.setOnClickListener(v -> {
            Intent intent = new Intent(NewsActivity.this, NewsDetailsActivity.class);
            intent.putExtra("title", "Students – Staff Interaction through Sports and Culture");
            intent.putExtra("content", "The Faculty of Arts, the largest at the University of Colombo, organized a sports and cultural festival to enhance unity among students from different years and backgrounds. The sports event was held on July 16 at the university grounds. A cultural performance festival named “Divyaradhana” followed on July 17 at the New Arts Theatre. These events promoted interaction between staff and students, encouraged teamwork, and celebrated artistic creativity.");
            intent.putExtra("imageResId", R.drawable.news3);
            startActivity(intent);
        });

        // Bottom navigation clicks
        iconSports.setOnClickListener(v -> Toast.makeText(this, "Sports clicked!", Toast.LENGTH_SHORT).show());
        iconAcademic.setOnClickListener(v -> Toast.makeText(this, "Academic clicked!", Toast.LENGTH_SHORT).show());
        iconEvents.setOnClickListener(v -> Toast.makeText(this, "Events clicked!", Toast.LENGTH_SHORT).show());

        // ☰ Menu popup
        menuButton.setOnClickListener(v -> {
            PopupMenu popupMenu = new PopupMenu(NewsActivity.this, menuButton);
            popupMenu.getMenuInflater().inflate(R.menu.profile_popup_menu, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(this::handleMenuClick);
            popupMenu.show();
        });
    }

    private boolean handleMenuClick(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.accountDetails) {
            startActivity(new Intent(this, UserInfoActivity.class));
            return true;
        } else if (id == R.id.developerInfo) {
            startActivity(new Intent(this, DeveloperInfoActivity.class));
            return true;
        } else if (id == R.id.settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        } else if (id == R.id.exit) {
            finishAffinity();
            return true;
        }
        return false;
    }
}
