package com.example.luckyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class lucky_activity extends AppCompatActivity {

    TextView welcometxt, lucky_num_txt;
    Button share_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky);

        welcometxt = findViewById(R.id.lucky_number_word);
        lucky_num_txt = findViewById(R.id.lucky_number_text);
        share_btn = findViewById(R.id.Share_number);

        Intent i = getIntent();

        String user_name = i.getStringExtra(name:"name");

        Toast.makeText(this, "Username "+user_name, Toast.LENGTH_SHORT).show()
    }
}