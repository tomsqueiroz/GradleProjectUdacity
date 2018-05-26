package com.example.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class jokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        TextView tv_piada = (TextView) findViewById(R.id.tv_piada);
        Intent i = getIntent();
        String piada = i.getStringExtra("piada");
        tv_piada.setText(piada);
    }
}
