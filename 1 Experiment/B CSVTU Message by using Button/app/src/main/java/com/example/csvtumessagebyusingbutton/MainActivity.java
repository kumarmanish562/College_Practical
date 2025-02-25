package com.example.csvtumessagebyusingbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity; // Use AppCompatActivity

public class MainActivity extends AppCompatActivity {  // Extend AppCompatActivity
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        Button b = findViewById(R.id.b1);
        EditText et1 = findViewById(R.id.et1);
        TextView tv1 = findViewById(R.id.tv1);

        // Set OnClickListener for Button
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(et1.getText().toString()); // Convert to string to avoid type issues
            }
        });
    }
}
