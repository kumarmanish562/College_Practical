package com.example.implicitandexplicitintentsapp;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dial(View v) {
        Intent i = new Intent(Intent.ACTION_DIAL);
        EditText et1 = findViewById(R.id.et1);
        i.setData(Uri.parse("tel:" + et1.getText().toString()));
        startActivity(i);
    }

    public void dial1(View v) {
        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
        i.setType("image/*");
        startActivity(i);
    }

    public void next(View v) {
        Intent i = new Intent(this, WelcomeActivity.class);
        startActivity(i);
    }

    public void whatsapp(View v) {
        Intent i = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        if (i != null) {
            startActivity(i);
        } else {
            // WhatsApp is not installed
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"));
            startActivity(browserIntent);
        }
    }
}
