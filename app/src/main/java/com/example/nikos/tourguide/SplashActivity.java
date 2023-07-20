package com.example.nikos.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_splash.xml layout file
        setContentView(R.layout.activity_splash);

        // Find the View that shows the image from the first page of the application
        ImageView imageSplashScreen = (ImageView) findViewById(R.id.image_splash);

        // Set a click listener on that View
        imageSplashScreen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the View is clicked on.
            @Override
            // Create a new intent to open the MainActivity
            public void onClick(View view) {
                // Start the MainActivity
                Intent imageSplashScreenIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(imageSplashScreenIntent);
            }
        });
    }
}
