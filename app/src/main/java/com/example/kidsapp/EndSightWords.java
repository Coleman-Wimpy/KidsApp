package com.example.kidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class EndSightWords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sight_words);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void Mainmenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void RestartReading(View view){
        Intent intent= new Intent(this, ReadingQuiz.class);
        startActivity(intent);
    }
}