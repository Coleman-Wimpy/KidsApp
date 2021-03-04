package com.example.kidsapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }

    public void math (View view) {
        Intent intent = new Intent(this, MathQuiz.class);
        startActivity(intent);
    }

    public void science (View view) {
        Intent intent = new Intent(this, ScienceQuiz.class);
        startActivity(intent);
    }

    public void history (View view) {
        Intent intent = new Intent(this, HistoryQuiz.class);
        startActivity(intent);
    }

    public void reading (View view) {
        Intent intent = new Intent(this, ReadingQuiz.class);
        startActivity(intent);
    }
}