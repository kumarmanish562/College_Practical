package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv = findViewById(R.id.actv);
        String[] values = getResources().getStringArray(R.array.country);

        // Specify type parameter for ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);

        actv.setAdapter(adapter);
        actv.setThreshold(1); // Start suggesting after 1 character
    }
}