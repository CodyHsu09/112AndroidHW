package com.example.raddiobutton1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

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