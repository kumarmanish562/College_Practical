package com.example.csvtutextmessage;

import android.os.Bundle;
import androidx.annotation.Nullable;  // Corrected import
import androidx.appcompat.app.AppCompatActivity; // Using AppCompatActivity

public class MainActivity extends AppCompatActivity {  // Extend AppCompatActivity
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}