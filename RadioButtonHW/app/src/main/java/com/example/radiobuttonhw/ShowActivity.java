package com.example.radiobuttonhw;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShowActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView txvShow = (TextView) findViewById(R.id.txvShow);
        txvShow.setTextSize(30);

        Intent intent = getIntent();
        txvShow.setText("訂單明細：" + "\n" + intent.getStringExtra("outputStr"));

    }
}